 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package com.company;

 import java.io.BufferedInputStream;
 import java.io.BufferedOutputStream;
 import java.io.DataInputStream;
 import java.io.DataOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.net.ServerSocket;
 import java.net.Socket;
 import java.util.logging.Level;
 import java.util.logging.Logger;

 /**
  *
  * @author V5-561G
  */
 public class Server {

     public static void main(String[] args) {
         try {
             ServerSocket serverSocket = new ServerSocket(8000);
             System.out.println("Server is Listening...");
             Socket socket = serverSocket.accept();
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             StringBuilder stringBuilder=new StringBuilder();
             while (true){

                 String orginal = dataInputStream.readUTF();
                 if (orginal.equals("Over")){break;}
                 else {
                    // String reverse = new StringBuilder(orginal).reverse().toString();
                     stringBuilder.append(orginal);
                     System.out.println("Request:  "+orginal);
                     //System.out.println("Result:   "+reverse);
                     //dataOutputStream.writeUTF(reverse);
                 }
                 dataOutputStream.writeUTF(stringBuilder.toString());
             }
             System.out.println("END");
             
             file file=new file();
             file.save(stringBuilder.toString());
             dataOutputStream.close();
             dataInputStream.close();
             serverSocket.close();
             socket.close();


         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
