package javalearning;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
	int a [] = {3,5,1,4,2};
	for(int i=a.length;i>0;i--) {
		for(int j=0;j<i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}

}
	
}
