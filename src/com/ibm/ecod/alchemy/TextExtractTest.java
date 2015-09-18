package com.ibm.ecod.alchemy;

import com.alchemyapi.api.AlchemyAPI;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

class TextExtractTest {
	public static void main(String[] args)
			throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
		
		AlchemyAPI alchemyObj = AlchemyAPI.GetInstanceFromString("5fc91e98eacfa5ebf83440e8c6a61d0f60fa380b");
		String URLString = "http://www.politico.com/";
		System.out.println("URL sent to URLGetText AlchemyAPI --> " + URLString);

		Document doc = alchemyObj.URLGetText(URLString);
		String convertDocToString = AlchemyUtility.getStringFromDocument(doc);
		String alchemyAPIResult = AlchemyUtility.returnResultFromXML(convertDocToString, "text");
		// System.out.println(convertDocToString);
		System.out.println("Output from URLGetText AlchemyAPI: Extracted Text is --> " + alchemyAPIResult);

	}
	
	

}
