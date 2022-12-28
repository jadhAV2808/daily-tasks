package com.numbers;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		
		int num=sc.nextInt();
		int digit=0;
		
		while(num!=0) {
			digit=num%10;
			System.out.print(digit + " ");
			num=num/10;
		}
		
		
		sc.close();
	}

}
