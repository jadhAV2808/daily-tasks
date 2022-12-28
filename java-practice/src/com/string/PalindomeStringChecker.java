package com.string;

import java.util.Scanner;

public class PalindomeStringChecker {

	public static void main(String[] args) {
		    
		    Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a String");
			
			String str=sc.next();
			String result="";
			
			StringBuffer sb=new StringBuffer(str);
			
			result=sb.reverse().toString();
			
			if(str.equals(result))
				System.out.println("Palindrome");
			else
				System.out.println("NOT a Palindrome");

	}

}
