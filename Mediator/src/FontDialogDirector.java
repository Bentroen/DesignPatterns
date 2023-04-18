public class FontDialogDirector extends DialogDirector {

	private ListBox listBox;
	private EntryField entryField;
	
	@Override
	public void createWidget() {
		listBox = new ListBox(this);
		entryField = new EntryField(this);	
	}

	@Override
	public void widgetChanged(Widget w) {
		listBox.getSelection();
	}		
	
	public static void main(String[] args) {
		FontDialogDirector director = new FontDialogDirector();
		director.createWidget();
		
		// This is done by the user via a screen interaction
		director.entryField.setText();
	}
	
}
