package widgets;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic {

	private List<Graphic> children = new ArrayList<Graphic>();
	
	
	@Override
	public void add(Graphic g) {
		children.add(g);
	}

	@Override
	public void remove(Graphic g) {
		children.remove(g);
	}

	@Override
	public List<Graphic> getChildren() {
		return children;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Picture and all subitems");
		for (Graphic graphic : children) {
			graphic.draw();
		}
	}
	
}
