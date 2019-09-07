package com.nt.array;

public class PrintArray {

	public static void main(String[] args) {

		int [] a=new int[] {1,2,3,4,5};
		/*for (int i : a) {
			System.out.println(i);
		}*/
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		String [] arr= {"vipin","kumar","sahu","java"};
		for(String str:arr) {
		
			System.out.println(str);
		}
	}

}
