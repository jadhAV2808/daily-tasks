package com.numbers;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		
		if(num<=0) {
			System.out.println("Invalid number "+num);
			throw new IllegalArgumentException("Invalid number "+num);
		}
		else {
			if(num%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		
		sc.close();
		
	}

}
