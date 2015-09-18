package com.ibm.ecod.alchemy;

import com.alchemyapi.api.AlchemyAPI;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


class LanguageTest {
    public static void main(String[] args)
        throws IOException, SAXException,
               ParserConfigurationException, XPathExpressionException
    {
    
    	AlchemyAPI alchemyObj = AlchemyAPI.GetInstanceFromString("5fc91e98eacfa5ebf83440e8c6a61d0f60fa380b");
    	
        System.out.println("Calling URLGetLanguage AlchemyAPI to detect the language for web URL: " + "http://news.google.fr ");
        Document doc = alchemyObj.URLGetLanguage("http://news.google.fr/");
        
        
		String convertDocToString = AlchemyUtility.getStringFromDocument(doc);
		String alchemyAPIResult = AlchemyUtility.returnResultFromXML(convertDocToString,"language");
		
		System.out.println("Output from URLGetAuthor AlchemyAPI: Language is --> " + alchemyAPIResult);
    }
    
    
   

}
