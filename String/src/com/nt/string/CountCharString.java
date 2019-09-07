package com.nt.string;

public class CountCharString {

	public static void main(String[] args) {
		
		String s="vipin kumar sahu";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
