package com.nt.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String::");
		String st = sc.nextLine();
		System.out.println("Enter String we Search::");
		String st1=sc.nextLine();
		distinctWord(st,st1);
	}

	public static void distinctWord(String st,String st3) {
		
		Map<String, Integer> map=new HashMap<>();
		String[] str=st.split(" ");
		for(String s:str) {
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}
			else {
				map.put(s, map.get(s)+1);
			}
		}
		System.out.println(map);
/*//		Set set=map.entryKey();
		Set set=map.keySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Object ste= itr.next();
			Integer in=map.get(ste);
			System.out.println(ste+"------>"+in);
		
		}*/
		Set<Map.Entry<String, Integer>> map11=map.entrySet();
		Iterator itr=map11.iterator();
		while (itr.hasNext()) {
			Map.Entry<String,Integer> mm=  (Entry<String, Integer>) itr.next();
			//System.out.println(mm.getKey()+"-->"+mm.getValue());
		
		System.out.println("=========================");
		
		if(map.containsValue(st3)) {
			System.out.println(st3+"is unique");
		if(map.containsKey(st3)) {
			System.out.println(st3+" is Pressent");
			
			}
		}}
	}
}
