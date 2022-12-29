package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenWordPrinter2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine();
		
		String  [] strArray=str.split(" ");
		
		for(int i=0; i<strArray.length;i++) {
			if(strArray[i].length()%2==0) {
				System.out.print(strArray[i]+" ");
			}
		}
		
		


	}

}
