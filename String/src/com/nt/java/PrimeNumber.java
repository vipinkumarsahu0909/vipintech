package com.nt.java;

import java.io.InputStream;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
//		int number=14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number::");
		int number=sc.nextInt();
		
		int temp=0;
		for(int i=2;i<number-1;i++) {
			if(number%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(number+":: is  prime");
		}
		else {
			System.out.println(number+":: is not prime");
		}
	}
}
