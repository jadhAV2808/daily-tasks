package com.numbers;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter num");
		
		int num=sc.nextInt();
		
		int rev=0, digit=0 , copy=num;
		
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
		sc.close();
		
		if(rev==copy)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome number");
		
	}


}
