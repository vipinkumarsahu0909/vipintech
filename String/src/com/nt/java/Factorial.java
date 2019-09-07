package com.nt.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

//		int number=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Number::");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		
		}
		System.out.println("factorial:: of"+number+":is ::"+fact);
	}

}
