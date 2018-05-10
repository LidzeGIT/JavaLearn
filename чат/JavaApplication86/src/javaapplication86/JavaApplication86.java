package javaapplication86;


import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class JavaApplication86 {

   
    public static void main(String[] args) throws IOException {
            ServerSocket socket = new ServerSocket(30333);
            
            while(true){
            Socket soc = socket.accept();
            ClientThread thread = new ClientThread(soc);
            thread.HandleConnectin();
           
            }
            
          
      }
    
}
