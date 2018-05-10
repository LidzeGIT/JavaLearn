package tictak;

public class ThreadOne extends Thread {
	
	private Object monitor;

	public ThreadOne(Object monitor){
			this.monitor = monitor;
		

	}

	public void run() {
		 try
		{
			for (int i = 0; i < TicTak.num; i++) {
				System.out.print("tik" + " - ");
				synchronized (monitor) {
					monitor.notify();					
					monitor.wait();
				}

			}
		}
		 catch (InterruptedException e) { e.printStackTrace(); }
	}
}
