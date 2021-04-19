package com.example.a0419opencvocr2.utils;

import java.util.Map;

public interface OCR7SegmentDictionary {

	Boolean UpdateElement (String element, Integer value);
	Map<String,Integer>  GetAllElements();
	void fillDictionary();
	void restartDictionary();
	String evaluateDictionary();
	
}
