import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import thirdparty.JsonImportService;

public class XmlToJsonAdapter extends JsonImportService implements Target {
	
	@Override
	public void loadDataFromXml(Document document) {
		System.out.println("[" + this.getClass().getName() + "] Converting XML document to JSON");
		String convertedJson = this.parseXml(document);
		this.loadJson(convertedJson);
	}
	
	public String parseXml(Document document) {
		
		Element nameElement = (Element)document.getElementsByTagName("name").item(0);
		String name = nameElement.getTextContent();

		Element ageElement = (Element)document.getElementsByTagName("age").item(0);
		String age = ageElement.getTextContent();
		
		return "{\"user\": {\"name\": \"" + name + "\", \"age\": " + age + "}}";
	}
	
}
