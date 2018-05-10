package javaapplication72;
public class JavaApplication72  {
  public static void main(String[] args) throws InterruptedException {
		Test test = new Test();
		
		Runnable runner1 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					test.increment();
					
				}
			}
		};
                
                Monitor m = new Monitor();
                
                Runnable runnable2 = new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            synchronized(m){
                                m.x++;
                           //может стоять любой друйго код                            
                            }
                        }
                    }
                };
                
		Thread [] threads = new Thread[3];
		for(int i = 0; i < 3; i++) {
			threads[i] = new Thread(runnable2);
			threads[i].start();
			
		}
		for(int i = 0; i < 3; i++) {
			threads[i].join();
		}
		System.out.println(test.getX());
                System.out.println(m.x);
	}
}

class Test {
	private int x;
	public int getX() {
		return x;
	}
	public synchronized void increment() {
		x++;
	}
}

class Monitor{
    public int x;
}