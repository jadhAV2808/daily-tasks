package com.stack;

import java.util.LinkedList;

public class PalindromeChecker {
	
	public static void main(String[] args) {
		
		System.out.println(checkForPalindrome("racecar"));
		System.out.println(checkForPalindrome("I did, did I?"));
		System.out.println(checkForPalindrome("hrllo"));


		
	}
	
	
	public static boolean checkForPalindrome(String str) {
		
		LinkedList<Character> stack=new LinkedList<Character>();
		
		StringBuilder strNoPunctuation=new StringBuilder(str.length());
		String lowercase=str.toLowerCase();
		
		for(int i=0;i<lowercase.length();i++) {
			char c=lowercase.charAt(i);
			if(c>='a' && c<='z') {
				strNoPunctuation.append(c);
				stack.push(c);
			}
		}
		
		StringBuilder reverseString=new StringBuilder(stack.size());
		
		while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}
		
		
		
		return reverseString.toString().equals(strNoPunctuation.toString());
	}

}
