package styles;

import components.VisualComponent;

public class BorderDecorator extends Decorator {

	public BorderDecorator(VisualComponent decorates) {
		super(decorates);
	}
	
	public void drawBorder() {
		System.out.println("Drawing border");
	}
	
	@Override
	public void draw() {
		super.draw();
		drawBorder();
	}

}
