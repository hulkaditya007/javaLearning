package javalearning;

public class InsertionSort {

	public static void main(String[] args) {
		int a [] = {23,52,65,16,1,0,10,25,87,94,43};
		for(int i = 0 ;i<a.length;i++) {
			for(int j =i;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
