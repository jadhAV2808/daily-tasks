package com.arrays;

import java.util.Scanner;

public class MinMaxFinder {
	
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
			System.out.print(a[i]+" ");
		}
		
		int min=a[0],max=a[0];
		
		for(int i=0;i<n;i++) {
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println(" ");
		System.out.println("Min "+min);
		System.out.println("Max "+max);
	}
}
