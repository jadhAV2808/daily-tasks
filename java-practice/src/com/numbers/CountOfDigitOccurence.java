package com.numbers;

import java.util.Scanner;

public class CountOfDigitOccurence {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		
		int num=sc.nextInt();
		
		System.out.println("enter digit to search");
		
		int d=sc.nextInt();
		
		int digit=0,count=0;
		
		while(num!=0) {
			digit=num%10;
			if(digit==d) {
				count++;
			}
			
			num=num/10;
		}
		System.out.println("occurence of the digit is "+count);
		
	}


}
