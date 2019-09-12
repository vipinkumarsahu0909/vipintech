package com.nt.string;

import java.util.Scanner;

public class CountCharString {

	public static void main(String[] args) {
		
	/*	String s="vipin kumar sahu";*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
