package javalearning;

public class LCMAndHCF {
	public static void main(String[] args) {
		int a = 27, b = 18;
		int val = 0;

		//LCM
		for (int i = a * b; i >= a; i--) {
			if (i % a == 0 && i % b == 0) {
				val = i;
			}
		}

		System.out.println(findGCD(a, b));
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGCD(b, a % b);
		}
	}
}

//Swap
//temp = a
//a=b
//b=temp
//a=a+b
//b=a-b
//a=a-b;
//
//
//a=4
//b=3
//
//a=4+3; a=7
//b=a-b = 7-3 = 4;
//a= a-b = 7-4 = 3

