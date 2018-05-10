package javalearn;

public class myThreadOne extends Thread {
    
    private int steps;

    public myThreadOne(int steps, String name) {
        super(name);
        this.steps = steps;
    }

    @Override
    public void run() {
       for (int i =0; i< steps;i++){
           System.out.println(Thread.currentThread().getName()+" - " + i);
       }
           
       
    }    
}
