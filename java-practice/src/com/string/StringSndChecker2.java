package com.string;

import java.util.Scanner;

public class StringSndChecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first  String");
		
		String str=sc.nextLine();
		
        System.out.println("enter last  String");
		
		String str2=sc.nextLine();
		
		if(str.endsWith(str2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
