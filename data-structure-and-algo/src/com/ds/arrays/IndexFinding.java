package com.ds.arrays;

import java.util.Scanner;

public class IndexFinding {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int index=0;
	
		System.out.println("enter number to find its index in array");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				index=i;
				break;
			}
		}

		if(index!=0)
			System.out.println("index of "+num+ " is "+index);
		else
			System.out.println(num + " is not there in array");
	}

}
