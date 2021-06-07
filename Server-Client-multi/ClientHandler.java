package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// ClientHandler class
class ClientHandler extends Thread
{
    private  DataInputStream dis;
    private DataOutputStream dos;
    final Socket s;


    // Constructor
    public ClientHandler(Socket s) throws IOException {
        this.s = s;
       dis=new DataInputStream(s.getInputStream());
        dos=new DataOutputStream(s.getOutputStream());
    }

    @Override
    public void run()
    {
        StringBuilder stringBuilder=new StringBuilder();
        while (true)
        {
            try {

                    String orginal = dis.readUTF();
                    if (orginal.equals("Over"))
                    {
                        break;
                    }
                    else {

                        stringBuilder.append(orginal);
                        System.out.println("Request:  "+orginal);
                        dos.writeUTF(stringBuilder.toString());
                    }

                } catch (IOException ioException) {
                ioException.printStackTrace();
            }


        }
        try
        {
            // closing resources
            this.s.close();
            this.dis.close();
            this.dos.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        }
}



