package javalearning;

@FunctionalInterface
public interface FunctioanlInterfaceEx {
	
	void abstractMethod();
	
	default void defaultMethodImpl() {
		System.out.println("Hii default method called");
	}
	
	static void staticMethod() {
		System.out.println("Hi from static method");
	}
}