package com.sort.algo;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[]= {12,-20,45,-35, 5,32,-9};
		
		for(int firstUnsortedIndex=1; firstUnsortedIndex<arr.length; firstUnsortedIndex++) {
			
			int newElement=arr[firstUnsortedIndex];
			
			int i;
			
			for(i=firstUnsortedIndex;i>0 && arr[i-1]>newElement; i--) {
				arr[i]=arr[i-1];
			}
			
			arr[i]=newElement;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
