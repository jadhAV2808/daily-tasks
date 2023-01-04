package com.hashtable;

public class Challenge {

	public static void main(String[] args) {

		int[] num=new int[10];
		int[] numsToAdd= {59382,43,6894,500,99,-58};
		
		for(int i=0;i<numsToAdd.length;i++) {
			num[hash(numsToAdd[i])]=numsToAdd[i];
		}
		for(int i=0;i<num.length;i++)
			System.out.print(" "+ num[i]);

	}
	
	public static int hash(int value) {
		return Math.abs(value%10);
	}

}
