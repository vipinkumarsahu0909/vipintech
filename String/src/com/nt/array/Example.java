package com.nt.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		int[] arr=new int[] {510,270,30,940,50};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
		System.out.println();
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}