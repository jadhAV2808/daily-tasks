package com.sort.algo;

import java.util.Arrays;

public class SortingInJDK {

	public static void main(String[] args) {
		
		int arr[]= {12,-20,45,-35, 5,32,-9};
		
		Arrays.sort(arr);
		
		//Arrays.parallelSort(arr);
		
		
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
