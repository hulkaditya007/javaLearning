package javalearning;

public class ThreadClass extends Thread {
	
	public void run() {
		
		for(int i=0;i<100;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		ThreadClass t2 = new ThreadClass();
		
		t1.start();
		t2.start();

	}

}
