package javalearning;

public class MergeSort {
	public static void main(String[] args) {
		int a [] = {23,52,65,16,1,0,10,25,87,94,43};
		int half = a.length/2;
		int[] b = addValues(a,0,half);
		int[] c = addValues(a,half,a.length);
		returnArray(b);
		returnArray(c);
		int []d = combineArray(b,c);
		sortedArray(d);
		System.out.println("Exact Value");
		printArrayValues(d);
		
	}
	
	static int[] returnArray(int a[]) {
		int half = a.length/2;
		int[] b = addValues(a,0,half);
		int[] c = addValues(a,half,a.length);
		int d[] = new int[b.length+c.length];
		if(a.length<=2) {
			if(half!=0) {
				sortedArray(a);
			}
			return a;
		}
		else {
			returnArray(b);
			returnArray(c);
			d = combineArray(b,c);
			sortedArray(d);
			
		}
		return d;
		
	}
	
	static int[] addValues(int org[],int start,int end) {
		int[] a = new int[end-start];
		for(int i=start,j=0;i<end;i++,j++) {
			a[j] = org[i];
		}
		return a;
	}
	
	static int[] combineArray(int a[],int b[]) {
		int[] c = new int[a.length + b.length];
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int i=a.length,j=0;i<a.length + b.length;i++,j++) {
			c[i] = b[j];
		}
		return c;
	}
	
	static int[] sortedArray(int a[]) {
		for(int i = 0 ;i<a.length;i++) {
			for(int j =i;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	static void printArrayValues(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
		   
		
  }


