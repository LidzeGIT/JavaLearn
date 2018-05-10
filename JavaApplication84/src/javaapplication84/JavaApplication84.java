
package javaapplication84;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;


public class JavaApplication84 extends Application {

   
    public static void main(String[] args) throws InterruptedException {
        ProgressBar bar = new ProgressBar();
        Task<Void> task = new MyTask();
        Thread th = new Thread(task);
        bar.progressProperty().bind(task.progressProperty());
        th.start();
        
        while(!task.isDone()){
            Thread.sleep(1000);
            System.out.println(bar.getProgress());
        }
        System.exit(0);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        
    }
    
}

class MyTask extends Task<Void>{

    @Override
    protected Void call() throws Exception {
        for (int i = 0; i < 10; i++) {
            updateProgress(i+1, 10);
            Thread.sleep(500);
            
        }
        return null;
    }

    @Override
    protected void succeeded() {
        System.out.println("Task done!");
    }
    
    
    
}