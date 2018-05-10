package javaapplication76;

import java.util.Random;

public class Paral {
        
        public static int [] array = new int[SumConsts.ARRAY_SIZE];
    
    public static void main(String[] args) throws InterruptedException {
        
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
         }
        
        int checkSum;
        long t1 = System.currentTimeMillis();
        checkSum = arraySum(array);
        long t2 = System.currentTimeMillis();
        System.out.println("check sum =" + checkSum + " working time " + (t2-t1));
        
        int[] results = new int[SumConsts.THREADS_COUNT];
        Thread [] threads = new Thread[SumConsts.THREADS_COUNT];
        
        for (int i = 0; i < threads.length; i++) {
                      threads[i] = new ThreadSum(results, i);
        }
        int pSum;
        long t3 = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        pSum = arraySum(results);
        long t4 = System.currentTimeMillis();
        System.out.println("parrallel sum = " +pSum+", working time "+(t4-t3));
        
    }
    
    private static int arraySum(int [] array){
    int s= 0;
    for(int num : array){
    s+=num;
}
    return s;
    }

}
    

