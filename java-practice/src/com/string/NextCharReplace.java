package com.string;

import java.util.Scanner;

public class NextCharReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine() ,result="";
		
		for(int i=0;i<str.length();i++){
			result=result+(char)(str.charAt(i)+1);
		} 
		
		System.out.println(result);
		
		sc.close();

	}

}
