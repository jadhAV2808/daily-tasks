package com.string;

import java.util.Scanner;

public class DuplicateGenerator2 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine();

		StringBuffer result=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			result.append(str.charAt(i));
			result.append(str.charAt(i));
			
		}
		
		System.out.println(result);
	
	}

}
