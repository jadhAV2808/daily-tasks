package com.string;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String str=sc.next();
		String result="";
		
		StringBuffer sb=new StringBuffer(str);
		
		result=sb.reverse().toString();
		
		System.out.println(result);

	}

}
