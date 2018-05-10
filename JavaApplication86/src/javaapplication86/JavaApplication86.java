package javaapplication86;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaApplication86 {

   
    public static void main(String[] args) throws IOException {
            ServerSocket socket = new ServerSocket(30333);
            Socket soc = socket.accept();
            
            System.out.println("Accepted conection from " + soc.getInetAddress().getCanonicalHostName());
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            
            String str = reader.readLine();
            out.println("> " + str);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
            writer.write("accept\n");
            writer.flush();
          
            
    }
    
}
