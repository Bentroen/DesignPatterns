import org.w3c.dom.Document;

import thirdparty.XmlExportService;

public class Main {

	public static void main(String[] args) {
		
		// Let's assume we want to work with a system that outputs XML,
		// but we need to load that data into another system that only
		// accepts JSON
		
		// Our adaptee is the JsonImportService, while the adapter is the JsonToXmlAdapter
		
		Document document = XmlExportService.exportXml("Bernardo", "21");
		
		// Now we use the Adapter to load the data instead of the actual service object
		
		Target xmlLoader = new XmlToJsonAdapter();
		xmlLoader.loadDataFromXml(document);
		
		// Notice how both messages in the console are emitted by XmlToJsonAdapter
		// -- the pattern means we use the subclass in place of the actual
		// JsonImportService, but behaving exactly like it
		
	}
	
}
