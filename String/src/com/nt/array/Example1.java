package com.nt.array;

public class Example1 {

	private Object[] obj=new Object[5];
	private int count=0;
	
	public void add(Object object) {
		if(size()==capacity()) {
			increaseCapacity();
		}
		obj[count++]=object;
	}
	public int size() {
		return count;
	}
	public int capacity() {
		return obj.length;
	}
	public void increaseCapacity() {
		Object[] newobj=new Object[obj.length*2];
		for(int i=0;i<obj.length;i++) {
			newobj[i]=obj[i];
		}
		obj=newobj;
	}
}
