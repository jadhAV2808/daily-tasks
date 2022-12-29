package com.recursion;

import java.util.Scanner;

public class Power {
	
	public static int square(int base, int exponent) {
		if(exponent==1)
			return base;
		else
			return base*square(base,exponent-1);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter base");
		int base=sc.nextInt();
		
		System.out.println("ENter exponent");
		int exponent=sc.nextInt();
		
		System.out.println("power is "+ square(base,exponent));
		
		

	}

}
