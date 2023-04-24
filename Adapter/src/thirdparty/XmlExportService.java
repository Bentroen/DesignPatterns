package thirdparty;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XmlExportService {

	public static Document exportXml(String name, String age) {
		
		String xmlString = "<?xml version=\"1.0\" encoding=\"utf-8\"?><user><name>" + name + "</name><age>" + age + "</age></user>";  

		System.out.println("[" + XmlExportService.class.getName() + "] Outgoing XML string:\n" + xmlString);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
		DocumentBuilder builder;  
		try {  
		    builder = factory.newDocumentBuilder();  
		    Document document = builder.parse(new InputSource(new StringReader(xmlString)));
		    return document;
		} catch (Exception e) {  
		    e.printStackTrace();
		}
	    return null;
	}
	
	
}
