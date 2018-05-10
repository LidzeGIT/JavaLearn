package javaapplication87;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.net.Socket;


public class JavaApplication87 {
   
    public static void main(String[] args) throws IOException {
        Socket soc= new Socket("localhost", 30333);
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        writer.write("Hello server!\n");
        writer.flush();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str = reader.readLine();
        out.println("server > " + str);
        
        
    }
    
}
