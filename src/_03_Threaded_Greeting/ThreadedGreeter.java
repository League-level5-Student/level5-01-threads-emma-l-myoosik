package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	private int v;

	public ThreadedGreeter(int v) {
		// TODO Auto-generated constructor stub
		this.v = v;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + v);
		
		Thread t = new Thread(new ThreadedGreeter(v+1));
		
		while (v <= 49) {
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
