
package javaapplication73;

public class JavaApplication73 {

    public static void main(String[] args) throws InterruptedException {
         Monitor m = new Monitor();
         
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < 100; i++) {
                     System.out.println("1 - "+i);
                     synchronized(m){
                     m.x++;
                     if(m.x>50)
                     m.notify();
                  }
                }
             }
         });
         
         Thread t2 = new Thread(()->{
               synchronized(m){
                   while(m.x<50) try { m.wait();} 
                   catch(InterruptedException ex){
                       System.out.println(ex.getMessage());
                   } 
               }
               for (int i = 0; i < 100; i++) {
                   System.out.println("2- "+i);
                 
             }
         });
        
        t1.start();
       // Thread.sleep(1);
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("sda");
        
    }
 }
class Monitor{
    public volatile int x;//не использовать оптимизацию
}