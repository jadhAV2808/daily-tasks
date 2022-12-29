package com.string;

import java.util.Scanner;

public class MaxOccurenceFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("enter String");
			
			String str=sc.nextLine();
			
			int []arr=new int[256];
			
			for(int i=0;i<str.length();i++) {
				arr[(int)str.charAt(i)]++;
			}

			int max=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[j]>arr[max])
					max=j;
			}
			
			System.out.println("max occuring character is :" + (char)max);
	}

}
