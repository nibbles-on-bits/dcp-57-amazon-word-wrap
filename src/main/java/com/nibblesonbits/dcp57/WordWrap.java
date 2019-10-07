package com.nibblesonbits.dcp57;

public class WordWrap {
	
	public static String wrapThis(String s, int k) {
		String ret = "";
		
		String[] sa = s.split(" ");
		
		String thisLine = "";
		
		for (String str : sa) {
			if (str.length() > k) { return null; }
			if ((thisLine.length() + str.length()) > k) {
				ret += "\n";
				thisLine = "";
			}
			if (thisLine!="") {
				ret += " ";
			}
			thisLine += str + " ";
			ret = (ret + str).trim();
		}
		
		
		return ret;
	}
	

}
