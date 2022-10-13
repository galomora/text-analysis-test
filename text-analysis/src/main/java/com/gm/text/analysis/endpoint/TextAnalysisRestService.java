package com.gm.text.analysis.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gm.text.analysis.model.AnalysisResult;
import com.gm.text.analysis.process.TextAnalyzer;

@RestController
public class TextAnalysisRestService {
	@RequestMapping (method = RequestMethod.POST, path = "/analyze")
	public ResponseEntity<AnalysisResult> analyzeText (@RequestBody String text) {
		return ResponseEntity.ok(new TextAnalyzer(text).analyze());
	}
}
