package com.string;

import java.util.Scanner;

public class StringSesrch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String");
		
		String str=sc.nextLine();
		
		String s="gold";
		
		str=str.toLowerCase();
		
		boolean found=false;
		
		
		for(int i=0;i<str.length();i++) {
			int k=i,j=0;
			
			for(j=0;j<s.length();j++) {
				if(str.charAt(k)!=s.charAt(j)) {
					break;
				}
				k++;
			}
			
			if(j==s.length()) {
				
				found=true;
				break;
			}
				
			
		}
		
		
		if(found)
			System.out.println("found");
		else
			System.out.println("not found");
		

	}

}
