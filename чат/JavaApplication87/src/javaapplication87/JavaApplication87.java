package javaapplication87;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.net.Socket;
import java.util.Scanner;


public class JavaApplication87 {
   
    public static void main(String[] args) throws IOException {
        Socket soc= new Socket("localhost", 30333);
         
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
         BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
         String str;
         Scanner scan = new Scanner(System.in);
                  
        while(true){
            out.print("> ");
            str = scan.nextLine();
            str += '\n';
            writer.write(str);
            writer.flush();
            if("exit\n".equals(str)) break;
            
            str = reader.readLine();
            out.println("server > " + str);
        }
        
    }
    
}
