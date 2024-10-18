package javalearning;

//public class StaticClass {
//	 int a = 10;
//	 void staticMehod() {
//		System.out.println(a);
//	}
//	public static void main(String[] args) {
//		StaticClass s = new StaticClass();
//		s.staticMehod();
//		int va = s.a;
//		
//	}
//}


class OuterClass {
    static String message = "Hello from the outer class!";

    // Static nested class
    static class NestedClass {
        public void printMessage() {
            System.out.println(message);  // Accessing static member of outer class
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
        nestedObj.printMessage();  // Output: Hello from the outer class!
    }
}

