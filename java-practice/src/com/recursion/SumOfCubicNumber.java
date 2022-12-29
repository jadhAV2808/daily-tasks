package com.recursion;

import java.util.Scanner;

public class SumOfCubicNumber {
	
	public static int sumOfCubes(int num) {
		if(num==0) 
			return 0;
		else 
			return (int) (Math.pow(num, 3)+sumOfCubes(num-1));
		
		
	}

	public static void main(String[] args) {
		System.out.println("ENter num");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println("sum is "+ sumOfCubes(num));
		

	}

}
