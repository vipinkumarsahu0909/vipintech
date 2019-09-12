package com.nt.array;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
		int brr[]=new int[arr.length];
//		int brr[]=arr.clone();
//		int brr[]=Arrays.copyOf(arr, arr.length);
//		copy all elements of arr to brr
		for(int i = 0;i < arr.length; i++ ) {
			brr[i] = arr[i];
		}
		for (int l : arr) {
			System.out.print(l+" ");
		}
		System.out.println();
		for (int p : brr) {
			System.out.print(p+" ");
		}
	}

}
