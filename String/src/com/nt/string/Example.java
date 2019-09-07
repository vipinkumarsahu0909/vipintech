package com.nt.string;

import java.util.Arrays;
import java.util.Scanner;

public class Example {

	/*public static String reverseString(String str) {
		String[] arrString=str.split(" ");
		String reverseString=" ";
		for(int i=arrString.length-1;i>=0;i--) {
			reverseString=reverseString+arrString[i]+" ";
			System.out.println(reverseString);
		}
		return reverseString;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String inputString=sc.nextLine();
		System.out.println(reverseString(inputString));
	}*/

/*	public static int countStringChar(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String inputString=sc.nextLine();
		System.out.println(countStringChar(inputString));
	}
	*/
	/*public static void main(String[] args) {
		String st1="vipin";
		String st2="pinvi";
		System.out.println("Anagram:"+checkAnagran(st1,st2));
	}
	public static boolean checkAnagran(String s1,String s2) {
		char[] charArrayFromString1=s1.toCharArray();
		char[] charArrayFromString2=s2.toCharArray();
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		return Arrays.equals(charArrayFromString1, charArrayFromString2);
	}
	*/
	/*public static void main(String[] args) {
		String s1="vipin kumar sahu";
checkPalindrome(s1);
	}
	
	public static void checkPalindrome(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			System.out.println(reverse); 
		}
	if(str.equals(reverse)) {
		System.out.println("not palindrome");
	}
	else {
		System.out.println("palindrome");
	}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		System.out.println(reverseString(str));
	}
	public static String reverseString(String s1) {
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		return reverse;
	}
*/
	/*public static void main(String[] args) {
		String s1="vipin";
		String s2="sahu";
		System.out.println(s1+"     "+s2);
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println(s1+"    "+s2);
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two String:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String result=alternateOrMergeString(s1,s2);
		System.out.println(result);
	}
	public static String alternateOrMergeString(String s1,String s2) {
		int i=0;
		String merge="";
		while(i<s1.length()&&i<s2.length()) {
			merge=merge+s1.charAt(i)+s2.charAt(i);
			i++;
		}
		while(i<s1.length()) {
			merge=merge+s1.charAt(i);
			i++;
		}
		while(i<s2.length()) {
			merge=merge+s2.charAt(i);
		i++;
		}
		
		return merge;
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String:");
		String s=sc.nextLine();
		countVowelsAndConsonents(s);
	}
	public static void countVowelsAndConsonents(String str) {
		int vCount=0,cCount=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				cCount++;
			}
			
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String str=sc.nextLine();
		int i=5;
		System.out.println(removeCharFromString(str,i));
	}
	public static String removeCharFromString(String st,int k) {
		System.out.println(st.substring(0,k));
		return st.substring(0,k)+st.substring(k+1);
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		System.out.println(checkRotation(st1,st2));
	}
	public static boolean checkRotation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		String str3=str1+str2;
		if(str3.contains(str2)) {
			return true;
		}
		else {
			return false;
		}
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String:");
		String st=sc.nextLine();
		System.out.println(toggleString(st));
	}
	public static String toggleString(String st) {
		String[] str=st.split(" ");
		String toggle="";
		for(String str1:str) {
			String firstLetter=str1.substring(0,1);
			String otherLetter=str1.substring(1);
			toggle= toggle+firstLetter.toUpperCase()+otherLetter.toLowerCase()+" ";
		}
		return toggle;
	}
}


