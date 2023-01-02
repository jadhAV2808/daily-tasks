package com.sort.algo;

public class SelectionSort {
	
	public static void swap(int arr[],int i,int j) {
		if(i==j)
			return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {12,-20,45,-35, 5,32,-9};
		
		
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			
			int largest=0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(arr[i]>arr[largest]) {
					largest=i;
				}
			}
			
			swap(arr,largest,lastUnsortedIndex);
		}
		
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");



	}

}
