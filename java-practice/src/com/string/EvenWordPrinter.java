package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinter {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine();
		
		StringTokenizer tokens=new StringTokenizer(str);
		
		while(tokens.hasMoreTokens()) {
			
			String eachToken=tokens.nextToken();
			if(eachToken.length()%2==0)
				System.out.print(eachToken + " ");
		}

	}

}
