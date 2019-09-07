package com.nt.java;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int number=370;
		int temp=number;
		int reminder,sum=0;
		while(number>0) {
			reminder=number%10;
			number=number/10;
			sum=sum+reminder*reminder*reminder;
			System.out.println(reminder);
			System.out.println(number);
			System.out.println(sum);
		}
		if(temp==sum) {
			System.out.println("Number is ArmStrong Number::"+temp);
		}
		else {
			System.out.println("Number is Not ArmStrong Number");
		}
	}

}
