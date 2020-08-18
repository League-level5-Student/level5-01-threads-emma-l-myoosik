package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> clq;
	
	Worker(ConcurrentLinkedQueue<Task> clq){
		this.clq = clq;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!clq.isEmpty()) {
			clq.remove().perform();
		}
	}


}
