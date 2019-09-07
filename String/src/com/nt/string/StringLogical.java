package com.nt.string;

public class StringLogical {

	public static void main(String[] args) {
		
		int number=13;
		palindrome(number);
	}
	public static void palindrome(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}	if(count==0) {
				System.out.println("it is prime number");
			}
			else {
				System.out.println("it is not prime number");
			}
		
	}
}