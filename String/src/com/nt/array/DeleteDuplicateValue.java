package com.nt.array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicateValue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int l=arr.length;
		System.out.println("Enter the value::");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		/*for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				
				}
			}
		}*/
		for(int i=0;i<l-1;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=arr[l-1];
					l--;
				}
			}
		}
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}
	}

}
