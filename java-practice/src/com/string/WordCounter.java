package com.string;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
			
	     System.out.println("Enter a String");
			
		 String str=sc.nextLine();
		 int count=0;
		 
		 for(int i=0;i<str.length();i++) {
			 if(Character.isWhitespace(str.charAt(i)))
				 count++;
		 }
		 
		 System.out.println("number of words are "+(count+1));

	}

}
