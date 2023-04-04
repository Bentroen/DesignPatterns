package templates;

public abstract class Widget implements Tooltip {

	public String tooltipText;
	protected Container container;
	
	public void showHelp() {
		if (tooltipText != null) {
			// Show tooltip
			System.out.println(tooltipText);
		} else {
			container.showHelp();
		}
	}
	
}
