package com.recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int factorialFinder(int num) {
		if(num==1)
			return 1;
		else
			return num*factorialFinder(num-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println("ENter num");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println("factorial is "+ factorialFinder(num));
		
		
	}

}
