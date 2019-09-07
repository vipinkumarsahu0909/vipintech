package com.nt.string;

public class RemoveElementFromString {

	public static String removeElement(String s,int p) {
		/*if(s.length()<0&&p<0) {
			return false;	
		}
		*/
		return s.substring(0, p)+s.substring(p+1);
	}
	public static void main(String[] args) {
		
		String s1="vipinsahu";
		int  i=5;
		System.out.println(removeElement(s1,i));
	}

}
