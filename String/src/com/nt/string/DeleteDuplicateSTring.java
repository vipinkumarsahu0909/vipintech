package com.nt.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteDuplicateSTring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String::");
		String st = sc.nextLine();
		duplicateStringDelete(st);
	}

	public static void duplicateStringDelete(String str) {
		String[] str1 = str.split(" ");
		Set<String> orgSet = new HashSet<>();
		Set<String> dupSet = new HashSet<>();
		for (String ss : str1) {
				if(!orgSet.contains(ss)) {
					orgSet.add(ss);
				}
				else {
					dupSet.add(ss);
				}
		}
		System.out.println(orgSet);
		System.out.println(dupSet);
	}
}
