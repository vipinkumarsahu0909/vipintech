package com.nt.string;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratore {

	public static void main(String[] args) {
			
		ArrayList al=new ArrayList();
		al.add("vipin");
		al.add("mannu");
		al.add("krishna");
		al.add("sanjay");
		System.out.println(al);
		ListIterator li=al.listIterator();
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj instanceof String) {
				String st=(String)obj;
				li.set(st.toUpperCase());
			
			}
			System.out.println(al);
		//	System.out.println("-----------------");
		/*while(li.hasPrevious()) {
			Object obj1=li.previous();
			System.out.println(obj1);
		}*/
	}}


}