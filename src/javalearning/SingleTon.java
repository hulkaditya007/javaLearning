package javalearning;

public class SingleTon {

	public static void main(String[] args) {
		
		MainHooNa mo = MainHooNa.getInstance();
		mo.method();
		mo.setVal(10);
		
		MainHooNa mo2 = MainHooNa.getInstance();
		System.out.print(mo2.getVal());
	}

}


class MainHooNa {

    // Volatile keyword ensures the visibility of changes across threads
    private static volatile MainHooNa instance;
    
    // Private constructor prevents instantiation from outside the class
    private MainHooNa() {}

    // Public method to return the Singleton instance, with double-checked locking
    public static MainHooNa getInstance() {
        if (instance == null) {  // First check without synchronization
            synchronized (MainHooNa.class) {
                if (instance == null) {  // Second check within synchronized block
                    instance = new MainHooNa();
                }
            }
        }
        return instance;
    }

    private int val;

    public void method() {
        System.out.println("Hello, how are you?");
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}