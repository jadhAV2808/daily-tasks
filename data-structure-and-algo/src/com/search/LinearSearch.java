package com.search;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int arr[] = {23,54,-11,45,88,90,65,34,-56};
		
		System.out.println("at index "+linearSearch(arr,90));
	}
	
	public static int linearSearch(int [] input,int value) {
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==value)
				return i;
		}
		return -1;
	}

}
