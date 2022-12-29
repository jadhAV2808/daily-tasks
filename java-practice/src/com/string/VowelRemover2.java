package com.string;

import java.util.Scanner;

public class VowelRemover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String");
		
		String str=sc.nextLine();
		String result=str.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(result);

	}

}
