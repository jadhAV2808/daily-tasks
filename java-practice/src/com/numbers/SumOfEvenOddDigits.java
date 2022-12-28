package com.numbers;

import java.util.Scanner;

public class SumOfEvenOddDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		
		int num=sc.nextInt();
		int digit=0, even=0 , odd=0;
		
		while(num!=0) {
			digit=num%10;
//			System.out.print(digit + " ");
			if(digit%2==0)
				even=even+digit;
			else
				odd=odd+digit;
			num=num/10;
		}
		
		System.out.println("sum of Even digits are "+even);
		System.out.println("sum of Odd digits are "+odd);
		
		sc.close();
	
	}
		

}
