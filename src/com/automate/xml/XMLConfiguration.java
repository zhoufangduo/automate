package com.automate.xml;

import java.io.Reader;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XMLConfiguration implements Configuration {
	
	
	
	public void parse(Reader reader) {
		
		SAXReader saxReader = new SAXReader();
		
		try {
			
			Document document = saxReader.read(reader);
			
			
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
}
