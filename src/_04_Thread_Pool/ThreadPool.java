package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool extends Thread {
	Thread[] t;
	ConcurrentLinkedQueue<Task> clq;
	
	ThreadPool(int v){
		t = new Thread[v];
		clq = new ConcurrentLinkedQueue<Task>();
		
		for (int i = 0; i < v; i++) {
			t[i] = new Thread(new Worker(clq));
		}
	}
	
	void addTask(Task task) {
		clq.add(task);
	}
	
	public void start() {
		for (int i = 0; i < t.length; i++) {
			t[i].start();
			try {
				t[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
