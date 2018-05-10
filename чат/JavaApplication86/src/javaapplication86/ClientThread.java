package javaapplication86;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.net.Socket;

public class ClientThread implements Runnable{

          private  BufferedReader reader;
          private  BufferedWriter writer;
          private String str;
          private  Socket soc;
          private Thread self;
          
          
    public ClientThread(Socket soc) throws IOException {
        this.soc = soc;
        reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        writer = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
        self = new Thread(this);
                        
    }
    
    public void HandleConnectin(){
         out.println("Accepted conection from " + soc.getInetAddress().getCanonicalHostName());
         self.start();
    }
    
    @Override
    public void run() {
        out.println("Client thread running...");
        
        try{
          while(true){
                
                    str = reader.readLine();
                    out.println("> " + str);
                    
                    if("exit".equals(str))break;
                                        
                    writer.write("accept: " + str + "\n");
                    writer.flush();
            }
        }
        catch (IOException ex){
            out.println(ex.getMessage());
        }
        out.println("Clietn thread quites!");
    }
    
}
