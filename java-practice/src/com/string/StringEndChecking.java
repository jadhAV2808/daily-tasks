package com.string;

import java.util.Scanner;

public class StringEndChecking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first  String");
		
		String str=sc.nextLine();
		
        System.out.println("enter last  String");
		
		String str2=sc.nextLine();
		
		int count=0;
		

		for(int i=str.length()-1,j=str2.length()-1;j>=0; i--,j--) {
			if(str.charAt(i)==str2.charAt(j))
				count++;
		}
		
		if(count==str2.length())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
