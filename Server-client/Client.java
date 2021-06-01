 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package com.companyone;

 import java.io.DataInputStream;
 import java.io.DataOutputStream;
 import java.io.IOException;
 import java.net.Socket;
 import java.util.Scanner;

 /**
  * this class mange client
  * creat client
  *
  */
 public class Client {


     public static void main(String[] args) {
         try {
             //creat socket
             Socket socket = new Socket("localhost", 8000);
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             Scanner scanner=new Scanner(System.in);
             while (true){
                 String str=scanner.nextLine();
                 if (str.equals("Over")){
                     dataOutputStream.writeUTF(str);
                     break;}
                 else{
                     dataOutputStream.writeUTF(str);
                     System.out.println(dataInputStream.readUTF() + "");
                 }

             }
             socket.close();
             dataInputStream.close();
             dataOutputStream.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }







