package com.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,8,9,56,89,99,110};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) 
			System.out.print(" "+ arr[i]);
		
		System.out.println("  ");
		System.out.println(binarySearch(arr,99));
		System.out.println(binarySearch(arr,5));
		System.out.println(binarySearch(arr,89));
		
		
		System.out.println("--------------------------- ");
		
		
		System.out.println(recursiveBinarySearch(arr,99));
		System.out.println(recursiveBinarySearch(arr,5));
		System.out.println(recursiveBinarySearch(arr,89));
		
		
	}
	
	
	public static int binarySearch(int[] input,int value) {
		
		int start=0;
		int end=input.length;
		
		while(start<end) {
			int midpoint=(start+end)/2;
			System.out.println("midpoint = "+midpoint);
			if(input[midpoint]==value) {
				return midpoint;
			}
			else if(input[midpoint]<value) {
				start=midpoint+1;
			}
			else {
				end=midpoint;
			}
		}
		
		return -1;
	}
	
	
	
	public static int recursiveBinarySearch(int[] input,int value) {
		
		return recursiveBinarySearch(input,0,input.length,value);
	}


	private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
		
		if(start>=end)
			return -1;
		
		int midpoint=(start+end)/2;
		System.out.println("midpoint "+midpoint);
		
		if(input[midpoint]==value)
			return midpoint;
		else if(input[midpoint]<value)
			return recursiveBinarySearch(input,midpoint+1,end,value);
		else
			return recursiveBinarySearch(input,start,midpoint,value);
	}

}
