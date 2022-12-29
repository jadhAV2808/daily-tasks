package com.arrays;

import java.util.Scanner;

public class OddIndexElements {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter aray size");
		int n=sc.nextInt();
		
		System.out.println("Enter aray elements");
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i%2!=0)
				System.out.println(a[i]);
		}

	}

}
