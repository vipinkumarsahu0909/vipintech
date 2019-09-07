package com.nt.coll;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public class HashTable1 {

	public static void main(String[] args) {

		Hashtable ht=new Hashtable<>();
		ht.put("v", new Double(90.90));
		ht.put("w", new Double(19.90));
		ht.put("x", new Double(20.90));
		ht.put(11, new Double(10.90));
		System.out.println(ht);
		Enumeration en=ht.keys();
		while(en.hasMoreElements()) {
			Object key=(Object) en.nextElement();
			Object value=ht.get(key);
			System.out.print(key+": ");
			System.out.println(value);
		}
		Properties props=new Properties();
		props.put("vi", new Double(90.90));
		props.put("vi1","ssj");
		props.put(11, new Double(90.90));
		System.out.println(props);
	}

}
