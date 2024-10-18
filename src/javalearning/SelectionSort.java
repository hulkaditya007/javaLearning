package javalearning;

public class SelectionSort {

	public static void main(String[] args) {
		int a [] = {3,5,1,4,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]= temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
