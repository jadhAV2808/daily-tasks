package com.arrays;

import java.util.Scanner;

public class ReversePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter aray size");
		int n=sc.nextInt();
		
		System.out.println("Enter aray elements");
		
		int a[] = new int[n];
		
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}
		

	}

}
