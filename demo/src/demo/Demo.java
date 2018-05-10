package demo;
public class Demo implements Runnable {

   private boolean canWork = true;
    private int counter=0;
    private Thread self;
  
    public Demo(){
    self = new Thread(this);
    self.start();
    }
    
   public void join(long ms){
        try {
            self.join(ms);
        } catch (InterruptedException ex) {
            System.out.println(Thread.currentThread().getName() +"was interruptet id join()!");
        }
   }
    
   public void cancel(){
       self.interrupt();
   }
   public void stop(){
       canWork = false;
   }

    @Override
    public void run() {
   /*     while(true){
            try {
                System.out.println(Thread.currentThread().getName() + " - "+ counter);
                counter++;
                Thread.sleep(100);
            } catch (InterruptedException ex) {
               System.out.println(Thread.currentThread().getName() + " was interruptet in Run()!");
               break;
            }*/
        
    
    while (canWork){
    System.out.println(Thread.currentThread().getName() + " - "+ counter);
counter++;

    }
}
}
