package document;

public abstract class AbstractDocumentLoader {

	public void loadDocument() {
		// Template method
		if (verifyDocumentSupported()) {
			try {
				openDocument();
			} catch (UnsupportedFileException e) {
				e.printStackTrace();
			}
		}
	}
	
	public abstract boolean verifyDocumentSupported();
	
	public abstract void openDocument() throws UnsupportedFileException;
	
}
