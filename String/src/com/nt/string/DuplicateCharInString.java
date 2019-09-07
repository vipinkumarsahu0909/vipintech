package com.nt.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharInString {

	public static void displayDuplicate(String str) {
		Map<Character, Integer> map=new HashMap<>();
		char[] characters=str.toCharArray();//vipin
		for(char ch:characters) {//v
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
			
			Set<Map.Entry<Character, Integer>> entryset=map.entrySet();
			for(Map.Entry<Character, Integer> entry:entryset) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+":"+entry.getValue());
				}
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {

//		String str="vipin kumar";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String str=sc.nextLine();
		displayDuplicate(str);
	}

}
