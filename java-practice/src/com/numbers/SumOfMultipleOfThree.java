package com.numbers;

import java.util.Scanner;

public class SumOfMultipleOfThree {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 
		 int num=sc.nextInt();
		 
		 int digit=0, sum=0;
		 
		 while(num!=0) {
			 digit= (num%10);
			 if(digit%3==0)
				 sum=sum+digit;
			 
			 num=num/10;
		 }
		 
		 System.out.println("Sum of multiple of 3 are "+sum);
	}
	
}
