package com.nt.coll;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			String str=(String)obj;
			System.out.println(str.toUpperCase());
		}
	}

}
