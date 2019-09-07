package com.nt.string;

public class RepitedString {

	public static void main(String[] args) {

		String s="vipini";
		char[] charArray=s.toCharArray();
		int count=0;
		int max=0;
		char maxChar=0;
		for(int i=1;i<charArray.length-1;i++) {
			if(charArray[i]==charArray[i+1]) {
				count++;
				System.out.println(count);
			}	
		else {
				if(count>max) {
					max=count;
					maxChar=charArray[i-1];
				}
				count=1;
			}
		}
		if(count>max) {
			max=count;
			maxChar=charArray[charArray.length-1];
		}
		System.out.println("longest run::"+max+", for the character "+maxChar);
		System.out.println("longest run::"+charArray[max]+", for the character "+maxChar);
	}
}
