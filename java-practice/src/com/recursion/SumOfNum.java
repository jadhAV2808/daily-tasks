package com.recursion;

import java.util.Scanner;

public class SumOfNum {

	
	public static int sum(int num) {
		if(num<=1) 
			return 1;
		else return num+sum(num-1);
		
		
	}
	public static void main(String[] args) {
		System.out.println("ENter num");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println("sum is "+ sum(num));
		
		

	}

}
