package styles;

import components.VisualComponent;

public class ScrollDecorator extends Decorator {

	public ScrollDecorator(VisualComponent decorates) {
		super(decorates);
	}
	
	public void drawScroll() {
		System.out.println("Drawing scroll area");
	}
	
	public void scrollTo(int x, int y) {
		System.out.println("Scrolling to (" + x + ", " + y + ")");
	}
	
	@Override
	public void draw() {
		super.draw();
		drawScroll();
	}

}
