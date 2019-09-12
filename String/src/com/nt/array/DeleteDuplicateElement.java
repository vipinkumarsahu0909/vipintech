package com.nt.array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicateElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array::");
		int size=sc.nextInt();
		int[] aa=new int[size];
		System.out.println("enter the elements::");
		for(int i=0;i<size;i++) {
			aa[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(aa));
		
		for(int i=0;i<aa.length-1;i++) {
			
			for(int j=1+i;j<aa.length;j++) {
				if(aa[i]==aa[j]) {
					System.out.println(aa[j]);
				}
			}

		}
	}

}
