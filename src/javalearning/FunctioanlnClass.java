package javalearning;

public class FunctioanlnClass implements FunctioanlInterfaceEx {

	@Override
	public void abstractMethod() {
		System.out.println("From Abstract method");
	}

	@Override
	public void defaultMethodImpl() {
		System.out.println("Overried default method");
	}
	
	
	public static void main(String args[]) {
		FunctioanlnClass f = new FunctioanlnClass();
		f.abstractMethod();
		f.defaultMethodImpl();
		FunctioanlInterfaceEx.staticMethod();
		
	}


}