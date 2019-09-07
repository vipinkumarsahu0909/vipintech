package com.nt.string;

public class StringRotation {

	public static boolean checkRotation(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		String s3=s1+s1;
		if(s3.contains(s2)) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		String str1="abcde";
		String str2="deabc";
		System.out.println(checkRotation(str1, str2));
	}

}
