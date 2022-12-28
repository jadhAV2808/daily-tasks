package com.numbers;

import java.util.Scanner;

public class PalindromeChecker2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  num");
		
		String num=sc.next();
		
		StringBuffer sb=new StringBuffer(num);
		
		String rev=sb.reverse().toString();
		
		System.out.println(num.equals(rev) ? "Palindrome Nuumber" : "Not Palindrome Number");
		
	}

}
