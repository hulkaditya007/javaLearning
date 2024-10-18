package javalearning;

//How to reverse a string in Java?
public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello";
		//Using Internal function
		StringBuilder str1 = new StringBuilder(str);
		str1 = str1.reverse();
		System.out.println(str1);
		
		StringBuilder str2 = new StringBuilder("World Hello");
		str2 = str2.reverse();
		System.out.println(str2);
	}
}
