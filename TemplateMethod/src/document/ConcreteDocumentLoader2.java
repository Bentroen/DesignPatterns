package document;

public class ConcreteDocumentLoader2 extends AbstractDocumentLoader {

	@Override
	public boolean verifyDocumentSupported() {
		System.out.println("Performed verifyDocumentSupported = false");
		return false;
	}

	@Override
	public void openDocument() throws UnsupportedFileException {
		throw new UnsupportedFileException("Document type not supported");
	}

}
