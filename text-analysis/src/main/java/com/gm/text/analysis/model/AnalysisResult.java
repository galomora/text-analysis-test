package com.gm.text.analysis.model;

import java.util.ArrayList;
import java.util.List;

public class AnalysisResult {
	private Long charCount;
	private Long digitsCount;
	private Long alphabetCharsCount;
	private Long uppercaseCount;
	private Long lowercaseCount;
	private Long whitespaceCount;
	private Long punctuationCount;
	private Long totalWords;
	private List<TopChar> topChars;
	
	public AnalysisResult () {
		topChars = new ArrayList<>();
	}
	
	public Long getCharCount() {
		return charCount;
	}
	public void setCharCount(Long charCount) {
		this.charCount = charCount;
	}
	public Long getDigitsCount() {
		return digitsCount;
	}
	public void setDigitsCount(Long digitsCount) {
		this.digitsCount = digitsCount;
	}
	public Long getAlphabetCharsCount() {
		return alphabetCharsCount;
	}
	public void setAlphabetCharsCount(Long alphabetCharsCount) {
		this.alphabetCharsCount = alphabetCharsCount;
	}
	public Long getUppercaseCount() {
		return uppercaseCount;
	}
	public void setUppercaseCount(Long uppercaseCount) {
		this.uppercaseCount = uppercaseCount;
	}
	public Long getLowercaseCount() {
		return lowercaseCount;
	}
	public void setLowercaseCount(Long lowercaseCount) {
		this.lowercaseCount = lowercaseCount;
	}
	public Long getWhitespaceCount() {
		return whitespaceCount;
	}
	public void setWhitespaceCount(Long whitespaceCount) {
		this.whitespaceCount = whitespaceCount;
	}
	public Long getPunctuationCount() {
		return punctuationCount;
	}
	public void setPunctuationCount(Long punctuationCount) {
		this.punctuationCount = punctuationCount;
	}
	public Long getTotalWords() {
		return totalWords;
	}
	public void setTotalWords(Long totalWords) {
		this.totalWords = totalWords;
	}

	public List<TopChar> getTopChars() {
		return topChars;
	}
	
	
	
}
