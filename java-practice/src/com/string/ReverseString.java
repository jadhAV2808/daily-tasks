package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String str=sc.next();
		String result="";
		
		for(int i=str.length()-1; i>=0;i--) {
			result=result+str.charAt(i);
		}

		System.out.println(result);
	}

}
