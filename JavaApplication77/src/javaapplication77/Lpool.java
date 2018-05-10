package javaapplication77;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lpool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ArrayList<Future<String>> results = new ArrayList<>();  
        
        
        ExecutorService servise =
               // Executors.newFixedThreadPool(5);
         Executors.newWorkStealingPool();
        for (int i = 0; i < 12; i++) {
            
           results.add(servise.submit(new Callable<String>(){
            @Override
                    public String call() throws Exception {
                       Thread.sleep(1000);
                       // System.out.println(Thread.currentThread().getName()
                          //      + " done");
                        return Thread.currentThread().getName() + " done";
                        
                    }
            }));
        }
        servise.shutdown();
        
        for (Future<String> result : results) {
            System.out.println(result.get());
            
        }
    }
}
