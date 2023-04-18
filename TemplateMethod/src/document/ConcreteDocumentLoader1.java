package document;

public class ConcreteDocumentLoader1 extends AbstractDocumentLoader {

	@Override
	public boolean verifyDocumentSupported() {
		System.out.println("Performed verifyDocumentSupported = true");
		return true;
	}

	@Override
	public void openDocument() {
		System.out.println("Document loaded");
	}

}
