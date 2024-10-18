package javalearning;

public class MultiThreading implements Runnable {

	public static void main(String[] args) throws InterruptedException {
     System.out.println(Thread.currentThread().getName());
     MultiThreading obj1 = new MultiThreading();
     MultiThreading obj2 = new MultiThreading();
     Thread t1 = new Thread(obj1);
     t1.setName("Thread1");
     Thread t2 = new Thread(obj2);
     t2.setName("Thread2");
     t1.start();
     t2.start();
     Thread.sleep(2000);
     System.out.println("Main Thread End");
	}

	@Override
	public void run() {
		
	  if(Thread.currentThread().getName().equalsIgnoreCase("Thread1"))
	  {
		  for(int i=0;i<5;i++)
		  {
			  System.out.println("Thread1: "+i);
			  try {
				Thread.sleep(1000);
			   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		  }
	  }
	  if(Thread.currentThread().getName().equalsIgnoreCase("Thread2"))
	  {
		  for(int i=5;i>=0;i--)
		  {
			  System.out.println("Thread2: "+i);
			  try {
				Thread.sleep(1000);
			   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		  }
	  }
		
	}

}
