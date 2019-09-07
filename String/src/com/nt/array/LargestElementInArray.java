package com.nt.array;

public class LargestElementInArray {

	public static void main(String[] args) {

		int[] arr=new int[] {10,-20,30,40,-80,100};
		System.out.println(arr.length);
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
