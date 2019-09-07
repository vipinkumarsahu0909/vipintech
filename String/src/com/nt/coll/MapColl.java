package com.nt.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapColl {

	public static void main(String[] args) {

		HashMap hm=new HashMap<>();
		hm.put("vipin", "java");
		hm.put("vipin1", new Double(1.8));
		hm.put("vipin2", new Character('a'));
		hm.put("vipin3", new String("hello"));
		System.out.println(hm);
		Set set=hm.keySet();
		Iterator hmitr=set.iterator();
		while(hmitr.hasNext()) {
			Object key=hmitr.next();
			Object value=hm.get(key);
			System.out.println(key+":"+value);
		}
		Collection col=hm.values();
		Iterator hitr=col.iterator();
		while(hitr.hasNext()) {
			System.out.println(hitr.next());
		}
		Set set1=hm.entrySet();
		Iterator itrs=set1.iterator();
		while (itrs.hasNext()) {
			Map.Entry me=(Map.Entry) itrs.next();
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		
		
	}

}
