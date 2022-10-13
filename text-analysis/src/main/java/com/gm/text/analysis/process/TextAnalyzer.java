package com.gm.text.analysis.process;

import com.gm.text.analysis.model.AnalysisResult;

public class TextAnalyzer {

	private String text;
	private AnalysisResult result;
	
	public TextAnalyzer (String text) {
		this.text = text;
	}
	
	public AnalysisResult analyze () {
		result = new AnalysisResult ();
		result.setCharCount(Long.valueOf(countCharacters()));
		result.setDigitsCount(countNumericChars ());
		result.setAlphabetCharsCount(countAlphaChars());
		result.setUppercaseCount(countUppercase());
		result.setLowercaseCount(countLowercase());
		result.setWhitespaceCount(countWhitespace());
		result.setPunctuationCount(countPunctuation());
		result.setTotalWords(countWords());
		return result;
	}
	
	private int countCharacters () {
		return TextProcess.countCharacters(text);
	}
	
	private Long countNumericChars () {
		return TextProcess.countNumericChars(text);
	}
	
	private Long countAlphaChars () {
		return TextProcess.countAlphaChars(text);
	}
	
	private Long countUppercase () {
		return TextProcess.countUppercase(text);
	}
	
	private Long countLowercase () {
		return TextProcess.countLowercase(text);
	}
	
	private Long countWhitespace () {
		return TextProcess.countWhitespace(text);
	}
	

	private Long countPunctuation () {
		return TextProcess.countPunctuation(text);
	}
	
	private Long countWords () {
		return TextProcess.countWords(text);
	}
	
	private void computeTopChars () {
		
	}
	
}
