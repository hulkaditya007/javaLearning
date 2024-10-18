package javalearning;

public class RunnableClass implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hi-->"+Thread.currentThread().getName());
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableClass());
		t1.setName("Drishti Thread");
		t1.start();
		
		Thread t2 = new Thread(new RunnableClass());
		t2.setName("Aditya Thread");
		t2.start();
	}

}
