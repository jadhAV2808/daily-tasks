/*
 * sum of its multiple =number
 * ex. 1+2+3=6
 * ex.2 1+2+4+7+14=28
 */

package com.numbers;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int sum=0 , copy=num;
		
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum=sum+i;
		}
	
		
		if(sum==copy)
			System.out.println("Perfect Number");
		else
			System.out.println("NOT a Perfect Number");
	}

	
		
}
