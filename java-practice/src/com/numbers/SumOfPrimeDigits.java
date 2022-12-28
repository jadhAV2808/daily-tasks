/*
 * prime numbers bet 1-9 are
 * 2,3,5,7
 * */

package com.numbers;

import java.util.Scanner;

public class SumOfPrimeDigits {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		int sum=0 ,digit=0;
		
		while(num!=0) {
			digit=num%10;
			
			if(digit==2|| digit==3 || digit==5 || digit==7)
				sum=sum+digit;
			
			num=num/10;
			
		}
		
		System.out.println("sum of prime digits "+sum);
		
	}

}
