package com.java.token;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		
		
		String str1 = "¿À´Ã ³ª¶û ÁöÈ¯ÀÌ´Â ¼Ò°öÃ¢À» ¸ÔÀ»°Å¾ß!";
		String str2 = "2018/06/14";
		
		StringTokenizer stringtokenizer1 = new StringTokenizer(str1);
		StringTokenizer stringtokenizer2 = new StringTokenizer(str2, "/");
		
		while(stringtokenizer1.hasMoreTokens()) {
			System.out.println(stringtokenizer1.nextToken());
		}
		
		while(stringtokenizer2.hasMoreTokens()) {
			System.out.println(stringtokenizer2.nextToken());
		}
		
		
	}

}
