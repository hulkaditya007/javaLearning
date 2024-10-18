package javalearning;

public class Mergedivide {
	public static void main(String[] args) {
		int a [] = {3,1,2,4,5};
		int x[]= divide(a);
		
		printArrayValues("Final Result", x);
		
		
	}
	
	static int[] divide(int[] a) {
		int mid = a.length/2;
		int b[] = addValues(a, 0, mid);
		printArrayValues("B values",b);
		int c[] = addValues(a,mid,a.length);
	
		printArrayValues("C values",c);		
		if(b.length>2) {			
			divide(b);
		}else {
			if(b.length==2 && b[0]>b[1]) {
				int temp = b[0];
				b[0] = b[1];
				b[1] = temp;
			}
			printArrayValues("Sorted B values",b);		
		}
		 if(c.length>2){
			divide(c);
		}else {
			if(c.length==2 && c[0]>c[1]) {
				int temp = c[0];
				c[0] = c[1];
				c[1] = temp;
			}
			printArrayValues("Sorted C values",c);	
		}
		
		int com[] = combineArray(b,c);
		 printArrayValues("Combined array",com);
		 
		 int x [] =sortedArray(com);
		 return x;
	}

	private static int[] combineArray(int[] b, int[] c) {
		int combine [] = new int [b.length+c.length];
		for(int i=0;i<b.length;i++) {
			combine[i]=b[i];
		}
		for(int i=b.length,j=0; i<combine.length;i++,j++) {
			combine[i]=c[j];
		}
		return combine;
	}
	
	static int[] sortedArray(int a[]) {
		printArrayValues("Going to sort",a);
		for(int i = 0 ;i<a.length;i++) {
			for(int j =i;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		printArrayValues("after sort",a);
		return a;
	}

	private static int[] addValues(int[] arr, int start, int end) {
		int newArr[] = new int[end-start];
		for(int i=start,j=0;i<end;i++,j++) {
			newArr[j] =arr[i];
		}
		return newArr;
		
	}

	static void printArrayValues(String msg , int []a) {
		System.out.println(msg);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
