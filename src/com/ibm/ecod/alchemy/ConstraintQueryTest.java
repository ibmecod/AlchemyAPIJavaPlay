package com.ibm.ecod.alchemy;

import com.alchemyapi.api.AlchemyAPI;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import java.io.*;

class ConstraintQueryTest {
    public static void main(String[] args)
        throws IOException, SAXException,
               ParserConfigurationException, XPathExpressionException
    {
   	
    	AlchemyAPI alchemyObj = AlchemyAPI.GetInstanceFromString("5fc91e98eacfa5ebf83440e8c6a61d0f60fa380b");
        String URLString = "http://www.huffingtonpost.com/2015/04/05/report-vegan-diet_n_7008156.html";
		System.out.println("URL sent to URLGetConstraintQuery AlchemyAPI --> " + URLString);
		Document doc = alchemyObj.URLGetConstraintQuery(URLString, "1st link");
		
		String convertDocToString = AlchemyUtility.getStringFromDocument(doc);
		String alchemyAPIResult = AlchemyUtility.returnResultFromXML(convertDocToString,"resultText");
		System.out.println("Output from URLGetConstraintQuery AlchemyAPI: resultText--> " + alchemyAPIResult);
    }

}
