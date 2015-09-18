package com.ibm.ecod.alchemy;

import com.alchemyapi.api.AlchemyAPI;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import java.io.*;

class EntityTest {
    public static void main(String[] args)
        throws IOException, SAXException,
               ParserConfigurationException, XPathExpressionException
    {
   	
    	AlchemyAPI alchemyObj = AlchemyAPI.GetInstanceFromString("5fc91e98eacfa5ebf83440e8c6a61d0f60fa380b");
        String URLString = "http://www.politico.com/";
		System.out.println("URL sent to URLGetRankedNamedEntities AlchemyAPI --> " + URLString);
		Document doc = alchemyObj.URLGetRankedNamedEntities(URLString);
		
		String convertDocToString = AlchemyUtility.getStringFromDocument(doc);
		String alchemyAPIResult = AlchemyUtility.returnResultFromXML(convertDocToString,"text");
		System.out.println("Output from URLGetConstraintQuery AlchemyAPI, Entity--> " + alchemyAPIResult);
    	
    }

}
