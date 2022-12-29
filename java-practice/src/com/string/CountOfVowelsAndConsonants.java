package com.string;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String");
		
		String str=sc.nextLine();
		
		int vowelCount=0, consonantCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isWhitespace(str.charAt(i)))
				continue;
			
			if(str.charAt(i)=='A' || str.charAt(i)=='a' ||
					str.charAt(i)=='E' || str.charAt(i)=='e' ||
					str.charAt(i)=='I' || str.charAt(i)=='i' ||
					str.charAt(i)=='O' || str.charAt(i)=='o' ||
					str.charAt(i)=='U' || str.charAt(i)=='u' )
				vowelCount++;
			else
				consonantCount++;
		}

		System.out.println("Vowel Count is "+vowelCount);
		System.out.println("consonant Count is "+consonantCount);
	}

}
