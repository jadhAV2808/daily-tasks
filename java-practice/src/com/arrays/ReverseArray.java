package com.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter aray size");
		int n=sc.nextInt();
		
		System.out.println("Enter aray elements");
		
		int a[] = new int[n];
		int reverse[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0,j=a.length-1;j>=0;i++,j--) {
			reverse[i]=a[j];
		}
		
		for(int i=0;i<reverse.length;i++) {
			System.out.print(reverse[i]+" ");
		}
	}

}
