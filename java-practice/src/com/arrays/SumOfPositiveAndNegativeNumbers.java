package com.arrays;

import java.util.Scanner;

public class SumOfPositiveAndNegativeNumbers {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter aray size");
		int n=sc.nextInt();
		
		System.out.println("Enter aray elements");
		
		int a[] = new int[n];
		int positiveSum=0,negativeSum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			if(a[i]>0)
				positiveSum=positiveSum+a[i];
			else
				negativeSum=negativeSum+a[i];	
		}

		System.out.println("sum of positive numbers "+positiveSum);
		System.out.println("sum of negative numbers "+negativeSum);
	
	}

}
