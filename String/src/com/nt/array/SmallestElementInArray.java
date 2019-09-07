package com.nt.array;

public class SmallestElementInArray {

	public static void main(String[] args) {

		int[] arr= {18,32,45,76,5,2,0,78};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
