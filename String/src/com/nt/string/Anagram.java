package com.nt.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean checkAnagram(String str1,String str2) {
//		convert String into char array
		char[] charArrayFromString1=str1.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
//		sort the char array data
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
//		print char array data
		System.out.println(charArrayFromString1);
		System.out.println(charArrayFromString2);
//		compare both char data
		return Arrays.equals(charArrayFromString1, charArrayFromString2);
	}
	public static void main(String[] args) {
		
		/*String st1="java";
		String st2="avaj";*/
		
//		take input from end user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Sting::");
		String st1=sc.nextLine();
		System.out.println("Enter Second String::");
		String st2=sc.nextLine();
		System.out.println("Anagram::"+checkAnagram(st1, st2));
		

	}

}
