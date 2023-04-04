package templates;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Widget {

	private List<Widget> children = new ArrayList<>();
	
	public void addChild(Widget child) {
		children.add(child);
		child.container = this;
	}
	
}
