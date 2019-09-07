package com.nt.string;

public class SwapTwoStringWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="vipin";
		String str2="sahu";
		System.out.println("before swap::"+str1+"  "+str2);
		str1=str1+str2;
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println(str2);
		System.out.println(str2.length());
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println("after swap::"+str1+"  "+str2);
	}

}
