
package demo;

public class NewClass {
    public static void main(String[] args){
        Demo demo = new Demo();
        
        demo.join(1000);
        //demo.cancel();
        demo.stop();
        System.out.println("end of mine()");
        
    }
}
