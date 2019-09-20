package com.nt.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringLogical {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String st=sc.nextLine();
		countConsonantsAndVowels(st);
		
	}
	public static void countConsonantsAndVowels(String str) {
		int ccount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				ccount++;
			}
		}
		System.out.println(ccount);
		}
	}
