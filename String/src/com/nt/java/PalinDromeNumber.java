package com.nt.java;

public class PalinDromeNumber {

	public static void main(String[] args) {

		int number=121,reminder,reverse=0;
		int temp=number;
		while(number>0) {
			reminder=number%10;
			number=number/10;
			reverse=reverse*10+reminder;
		}
		
		if(temp==reverse) {
			System.out.println("Number is Palindrome Number");
		}
		else {
			System.out.println("Number is Not Palindrome Number");
		}
	}

}
