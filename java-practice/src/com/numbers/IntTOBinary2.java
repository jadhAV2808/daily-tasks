package com.numbers;

import java.util.Scanner;

public class IntTOBinary2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enterr numberr");
		
		int num=sc.nextInt();
		
		System.out.println("binary conversion is "+ Integer.toBinaryString(num));
		
		sc.close();
	}

}
