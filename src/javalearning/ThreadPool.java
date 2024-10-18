package javalearning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				ex.execute(new Task());
				Thread.sleep(500); // Sleep for 500 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}


class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
