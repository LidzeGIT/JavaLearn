package javaapplication76;


public class ThreadSum extends Thread {
    
    private int [] res;
    private int pos;

    public ThreadSum(int[] res, int pos) {
        this.res = res;
        this.pos = pos;
    }

    @Override
    public void run() {
       
    res[pos]=0;
        for (int i = pos; i < Paral.array.length; i+=SumConsts.THREADS_COUNT) {
            
            res[pos]+=Paral.array[i];
            
        }
    
    }
 
}
