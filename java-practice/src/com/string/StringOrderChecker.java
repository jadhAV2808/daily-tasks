package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine() ,result="";
		
		char[] arr=str.toCharArray();
		
		Arrays.sort(arr);
		
		System.out.println(new String(arr).equals(str));
		
		
		sc.close();


	}

}
