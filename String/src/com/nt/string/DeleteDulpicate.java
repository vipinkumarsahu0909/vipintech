package com.nt.string;

import java.util.HashSet;
import java.util.Set;

public class DeleteDulpicate {

	public static void removeDuplicate(String str) {
		Set<Character> set=new HashSet<>();
		Set<Character> dupset=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}else {
				dupset.add(c);
				sb1.append(c);
			}
		}
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		//System.out.println(set);
		//System.out.println(dupset);
	}
	public static void main(String[] args) {

		String st="vipin";
		removeDuplicate(st);
}}
	
	
