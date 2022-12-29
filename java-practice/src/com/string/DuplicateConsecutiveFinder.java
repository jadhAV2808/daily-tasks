package com.string;

import java.util.Scanner;

public class DuplicateConsecutiveFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine();
		
		boolean found=false;
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt( i+1)){
				found=true;
				break;
			}
				
		}

		if(found)
			System.out.println("Found");
		else
			System.out.println("NOT Found");
		
	}

}
