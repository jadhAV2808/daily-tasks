package com.numbers;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		
		int num=sc.nextInt();
		int digit=0, sum=0;
		
		while(num!=0) {
			digit=num%10;
//			System.out.print(digit + " ");
			sum=sum+digit;
			num=num/10;
		}
		
		System.out.println("sum of all digits are "+sum);
		
		sc.close();
	
	}
		
	}
	
	



