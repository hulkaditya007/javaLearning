package javalearning;

import java.util.concurrent.Callable;

public class CallableImplentation implements Callable<Integer>{


	int number = 0;
	
	public CallableImplentation(int number) {
		this.number = number;
	}


	@Override
	public Integer call() throws Exception {
		// Simulate a long-running task
        Thread.sleep(2000);
        return number * number;
	}

	
	public static void main(String[] args) throws Exception {		
		CallableImplentation c = new CallableImplentation(5);
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Integer result = c.call();
					System.out.println("result"+ result);
					System.out.println(Thread.currentThread().getName());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t.start();
	}
	
	
}
