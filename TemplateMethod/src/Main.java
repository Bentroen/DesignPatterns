import document.AbstractDocumentLoader;
import document.ConcreteDocumentLoader1;
import document.ConcreteDocumentLoader2;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractDocumentLoader loader1 = new ConcreteDocumentLoader1();
		loader1.loadDocument();
		
		AbstractDocumentLoader loader2 = new ConcreteDocumentLoader2();
		loader2.loadDocument();
		
	}
	
}
