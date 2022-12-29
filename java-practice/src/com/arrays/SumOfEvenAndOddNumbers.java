package com.arrays;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter aray size");
		int n=sc.nextInt();
		
		System.out.println("Enter aray elements");
		
		int a[] = new int[n];
		int evenSum=0,oddSum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			if(a[i]%2==0)
				evenSum=evenSum+a[i];
			else
				oddSum=oddSum+a[i];	
		}

		System.out.println("sum of even numbers "+evenSum);
		System.out.println("sum of odd numbers "+oddSum);
	}

}
