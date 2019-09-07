package com.nt.string;

public class ToggleString {

	public static String toggleLetter(String st) {
		String[] str=st.split(" ");
		String toggle="";
		for(String s:str) {
			String firstletter=s.substring(0,1);
			String secondletter=s.substring(1);
			toggle=toggle+firstletter.toUpperCase()+secondletter.toLowerCase()+" ";
		}
//		return toggle;
		return toggle.trim();
	}
	public static void main(String[] args) {

		System.out.println(toggleLetter("vipin kumar sahu"));
		
	}

}
