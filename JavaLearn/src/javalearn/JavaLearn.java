package javalearn;
public class JavaLearn implements Runnable {

    private int steps;
    private Thread self;

    public JavaLearn (int steps, String name) {
        this.steps = steps;
        self = new Thread(this,name);
        //self.start();
    }

    public void start(){
        self.start();
    }

    public void join(){
        try {
            self.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

   
    public void run() {
        for(int i =0;i<steps;i++){
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }
    }

}
