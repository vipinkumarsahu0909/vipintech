package com.nt.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example {
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		/*int number=14;
		int count=0;*/
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not prime number");
		}
	}
}