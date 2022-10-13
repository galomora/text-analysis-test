package com.gm.text.analysis.process;

public class TextProcess {
	public static int countCharacters (String text) {
		return text.toCharArray().length;
	}
	
	public static Long countNumericChars (String text) {
		return text.chars().filter(character -> character > 47 && character < 58).count();
	}
	
	public static Long countAlphaChars (String text) {
		return text.chars().filter(character -> ! (character > 47 && character < 58)).count();
	}
	
	public static Long countUppercase (String text) {
		int count = 0;
		char[] textAsArray = text.toCharArray();
		for (int i = 0; i < textAsArray.length; i++) {
			if (textAsArray[i] >= 'A' &&  textAsArray[i] <= 'Z') {
				count++;
			}
		}
		return Long.valueOf(count);
	}
	
	public static Long countLowercase (String text) {
		int count = 0;
		char[] textAsArray = text.toCharArray();
		for (int i = 0; i < textAsArray.length; i++) {
			if (textAsArray[i] >= 'a' &&  textAsArray[i] <= 'z') {
				count++;
			}
		}
		return Long.valueOf(count);
	}
	
	public static Long countWhitespace (String text) {
		return text.chars().filter(character -> character == 32).count();
	}
	

	public static Long countPunctuation (String text) {
		return text.chars().filter(character -> 
		character == 44 ||
		character == 59 ||
		character == 45 ||
		character == 58 ||
		character == 95 
		).count();
	}
	
	public static Long countWords (String text) {
		return Long.valueOf(text.split(" ").length);
	}
}
