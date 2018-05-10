package jni;



public class Jni {
    public static void main(String[] args) {
        
        System.out.println("Hello" + Thread.currentThread().getName());
        
        myThread tr = new myThread();
        tr.start();
        try {
            // tr.run();
            tr.join();
        } catch (InterruptedException ex) {
             System.out.println(ex.getMessage());
        }
        
       
       System.out.println("end");
        
        
        
    }
    
}
