package com.nt.coll;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList<>();
		al.add("vipin");
		al.add(90.90);
		al.add('x');
		al.add(12);
		al.add("sahu");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.contains(12));
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println(al.hashCode());
		
	}

}
