package com.nt.java;

import java.util.Scanner;

public class AString {

		public static String reverseString(String st) {
			
			String[] st1=st.split(" ");
			String resultString="";
			for(int i=st1.length-1;i>=0;i--) {
//				resultString+=st1[i]+" ";
				resultString=resultString+st1[i]+" ";
			}
			return resultString;
		}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Full Name ::");
		String str=sc.nextLine();
		String result=reverseString(str);
		System.out.println(str);
		System.out.println(result);
		}
	}
	
