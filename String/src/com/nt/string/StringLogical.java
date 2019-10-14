package com.nt.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;import com.nt.coll.MapColl;

public class StringLogical {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String st=sc.nextLine();
		System.out.println("Enter String::");
		String st2=sc.nextLine();
		
		System.out.println(mergeString(st,st2));
	}
	public static boolean mergeString(String str1,String str2) {
	
		if(str1.length()!=str2.length()) {
			return false;
		}
		String s3=str1+str1;
		if(s3.contains(str2))
			return true;
		else
			return false;
	}
	}
