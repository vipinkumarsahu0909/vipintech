package com.nt.  string;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		String str="Vipin Kumar Sahu";
		
//		counter variable to store the count of vowels and consonants
		int cCount=0,vCount=0;
//		conveerting entire String into lowercase
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {

//			check wheather word is consonant or not
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str. charAt(i)<='z') {
				cCount++;
			}
}
		System.out.println(cCount);
		System.out.println(vCount);
	
	}

}
