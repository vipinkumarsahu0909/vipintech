package com.nt.string;

import java.util.Scanner;

public class MergeOrAlternateString {

	public static String alternate(String s1,String s2) {
		String str="";
		int i=0;
		while(i<s1.length()&&i<s2.length()) {
			str=str+s1.charAt(i)+""+s2.charAt(i);
			i++;
		}
		while(i<s1.length()) {
			str=str+s1.charAt(i);
			i++;
		}
		while(i<s2.length())
		{
			str=str+s2.charAt(i);
			i++;
		}
		return str;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two String");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(alternate(s1, s2));
	}

}
