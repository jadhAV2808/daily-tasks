package com.string;

import java.util.Scanner;

public class DuplicateCharGenerator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine() , result="";
		
		
		
		for(int i=0;i<str.length();i++){
			result=result+str.charAt(i)+str.charAt(i);
		}
		
		System.out.println(result);
	}

}
