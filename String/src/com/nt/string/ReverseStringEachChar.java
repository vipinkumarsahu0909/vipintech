package com.nt.string;

import java.util.Scanner;

public class ReverseStringEachChar {

	public static String reverseString(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse =reverse+str.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String original=sc.nextLine();
		String result=reverseString(original);
		System.out.println(original);
		System.out.println(result);
	}

}
