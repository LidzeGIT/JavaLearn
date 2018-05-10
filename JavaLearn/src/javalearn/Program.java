package javalearn;

public class Program extends Thread {


    public static void main(String[]args) throws InterruptedException {

        myThreadOne t1 = new myThreadOne(10, "Counter1");
        myThreadOne t2 = new myThreadOne(10, "counter2");

        t1.start();
        t2.start();

        t2.join();
        t1.join();

    }
}
