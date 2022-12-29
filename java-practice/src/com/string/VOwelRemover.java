package com.string;

import java.util.Scanner;

public class VOwelRemover {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String");
		
		String str=sc.nextLine();
		String result="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A'
					|| str.charAt(i)=='e' || str.charAt(i)=='E'
					|| str.charAt(i)=='i' || str.charAt(i)=='I'
					|| str.charAt(i)=='o' || str.charAt(i)=='O'
					|| str.charAt(i)=='u' || str.charAt(i)=='U')
				continue;
			else
				result=result+str.charAt(i);
		}
		
		System.out.println(result);

	}

}
