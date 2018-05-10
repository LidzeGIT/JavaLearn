
package javaapplication81;

import java.util.logging.Level;
import java.util.logging.Logger;

public class moveThread implements Runnable{
    
    private boolean canMove;
    private int delay;
    private NewJFrame frame;
    private Thread self;

    public moveThread(NewJFrame frame, int delay) {
        this.frame = frame;
        this.delay = delay;
        canMove = true;
        self = new Thread(this,"BoxMoveThread");
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
    
    public void start(){
        self.start();
    }
    
    public void stop(){
        canMove = false;
}

    @Override
    public void run() {
       
        while(canMove){
            frame.moveBox();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
        
    }  
    
}
