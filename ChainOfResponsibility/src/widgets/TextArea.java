package widgets;

import templates.Widget;

public class TextArea extends Widget {

	public String infoHelpText;
	
	public TextArea(int x, int y, int w, int h) {
	
	}

	@Override
	public void showHelp() {
		if (infoHelpText != null) {
			// Show tooltip
			System.out.println(infoHelpText);
		} else {
			super.showHelp();
		}
	}
	
}
