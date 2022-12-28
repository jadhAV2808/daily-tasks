/*
 * number having zeroes inside it not at beginning
 * */

package com.numbers;

import java.util.Scanner;

public class DuckNumberChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int  digit;
		boolean isDuckNumber=false;
		
		while(num!=0) {
			digit=num%10;
			
			if(digit==0) {
				isDuckNumber=true;
				break;
			}
			num=num/10;
		}
		
		if(isDuckNumber) 
			System.out.println("Duck number");
		
		else
			System.out.println("Not a Duck Number");

	}

}
