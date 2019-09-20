 package com.nt.array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int[] a= {10,20,330,40};
		int[] b= {540,60,70,80,90};
		int[] c= new int[a.length+b.length];
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++) {
			c[count++]=b[j];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
			}

}
