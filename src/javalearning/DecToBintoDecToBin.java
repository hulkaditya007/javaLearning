package javalearning;

public class DecToBintoDecToBin {
	public static void main(String[] args) {
		int a = 123;
		
		System.out.println(Integer.toBinaryString(a));
		
		 int num = 123;  // The given number
	        
	        // Create a StringBuilder to store binary result
	        StringBuilder binary = new StringBuilder();
	        
	        // Edge case for 0
	        if (num == 0) {
	            System.out.println("Binary representation: 0");
	            return;
	        }

	        // Convert decimal to binary manually
	        while (num > 0) {
	            int remainder = num % 2; // Get remainder (0 or 1)
	            binary.insert(0, remainder); // Insert at the beginning of the string
	            num = num / 2; // Divide the number by 2
	        }

	        System.out.println("Binary representation of 123: " + binary);
	        int sum = 0;
	        for(int i=binary.length()-1, j=1;i>=0;i--,j=j*2) {
	        	int val = Integer.parseInt(""+binary.charAt(i));
	        	sum = sum+(val*j);
	        }
	        System.out.println(sum);
	        
	    
	}
}
