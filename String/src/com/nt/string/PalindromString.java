package com.nt.string;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr String:::");
		String original=sc.nextLine();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse =reverse+original.charAt(i);
		}
		System.out.println(reverse);

		if(original.equals(reverse)) {
			System.out.println("String is Palindrome::");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
