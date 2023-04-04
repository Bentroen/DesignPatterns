import templates.Widget;
import widgets.Button;
import widgets.MainWindow;
import widgets.TextArea;

public class Main {

	public static void main(String[] args) {
		initUI();
	}
	
	public static void initUI() {
        MainWindow dialog = new MainWindow();
        dialog.websiteUrl = "http://example.com";
        TextArea textArea = new TextArea(0, 0, 400, 800);
        textArea.infoHelpText = "This is a text area. Type the text you want to insert";
        Button okButton = new Button(320, 640, 50, 20, "OK");
        okButton.tooltipText = "Confirm and close the window";
        Button cancelButton = new Button(320, 760, 50, 20, "Cancel");
        dialog.addChild(textArea);
        dialog.addChild(okButton);
        dialog.addChild(cancelButton);
        
        // Test help tooltip
        // (e.g. user hovers each widget and presses F1)
        invokeHelp(textArea);
        invokeHelp(dialog);
        invokeHelp(cancelButton);
	}
	
	public static void invokeHelp(Widget widget) {
		widget.showHelp();
	}

	
}
