package com.nt.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringLogical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String::");
		String st = sc.nextLine();
		distinctWord(st);
	}
	public static void distinctWord(String st) {
		Map<Character, Integer> map=new HashMap<>();
		char[] ch=st.toCharArray();
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		for(Map.Entry<Character, Integer> map1:set) {
			if(map1.getValue()>1){
				System.out.println(map1.getKey()+"    "+map1.getValue());
			}
		}
	}
}