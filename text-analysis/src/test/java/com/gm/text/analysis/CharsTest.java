package com.gm.text.analysis;

import org.junit.jupiter.api.Test;

import com.gm.text.analysis.model.AnalysisResult;
import com.gm.text.analysis.process.TextAnalyzer;

public class CharsTest {
	private static String testString = "1 234567890AAAvvv,;-:_";
	
	@Test
	public void testAnalysis () {
		TextAnalyzer analyzer = new TextAnalyzer(testString);
		
		AnalysisResult result = analyzer.analyze();
		testString.chars().forEach(c ->
		System.out.println (c));
		System.out.println("chars " + result.getCharCount());
		System.out.println("digits " + result.getDigitsCount());
		System.out.println("alpha " + result.getAlphabetCharsCount());
		System.out.println("upper " + result.getUppercaseCount());
		System.out.println("lower " + result.getLowercaseCount());
		System.out.println("spaces " + result.getWhitespaceCount());
		System.out.println("punctuation " + result.getPunctuationCount());
	}
}
