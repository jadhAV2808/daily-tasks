package com.sort.algo;

public class DescendingInsertionSort {

	public static void main(String[] args) {
		
		int arr[]= {12,-20,45,-35, 5,32,-9};
		
		insertionSort(arr,arr.length);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
	}
	
	
	
	public static void insertionSort(int arr[],int numItems) {
		if(numItems<2)
			return;
		
		insertionSort(arr,numItems-1);
		
		int newElement=arr[numItems-1];
		
		int i;
		
		for(i=numItems-1;i>0 && arr[i-1]>newElement; i--) {
			arr[i]=arr[i-1];
		}
		
		arr[i]=newElement;
		
		System.out.println("Result of call when numItems="+numItems);
		
		for(int s=0;s<arr.length;s++) {
			System.out.print(arr[s]+" ");
			System.out.print(",");
		}
			
		System.out.println(" ");
		System.out.println("---------------");
	}
	
	

}
