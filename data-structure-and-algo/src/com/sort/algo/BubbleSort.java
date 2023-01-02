package com.sort.algo;

public class BubbleSort {
	
	public static void swap(int arr[],int i,int j) {
		if(i==j)
			return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {12,-20,45,-35, 5,32,-9};
		
		
		for(int lastSortedIndex=arr.length-1;lastSortedIndex>0;lastSortedIndex--) {
			
			for(int i=0;i<lastSortedIndex;i++) {
				if(arr[i]>arr[i+1])
					swap(arr, i, i+1);
			}
		}

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
