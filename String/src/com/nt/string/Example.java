package com.nt.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String::");
		String str1 = sc.nextLine();
		toggleString(str1);
	}

	public static void toggleString(String st) {
		
		/*char[]  ch=st.toCharArray();
		System.out.println(ch.length);
		System.out.println(ch[ch.length-1]);
		System.out.println(ch[ch.length-2]);*/
		String[] st1=st.split(" ");
		System.out.println(st1.length);
		System.out.println(st1[st1.length-1]);
		System.out.println(st1[st1.length-2]);
	}
}