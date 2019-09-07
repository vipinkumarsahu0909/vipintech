package com.nt.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		String[] st= {"java","hb","spring","java","hb","ws"};
		Set nonDuplicate=new HashSet();
		Set duplicate =new HashSet();
		for(String str:st) {
			if(!nonDuplicate.contains(str)){
				nonDuplicate.add(str);
			}
			else{
				duplicate.add(str);
			}
		}
		System.out.println(duplicate);
		
		int[] arr= {10,20,30,40,50,20,50};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
