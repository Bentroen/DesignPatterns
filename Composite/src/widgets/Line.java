package widgets;

import java.util.ArrayList;
import java.util.List;

public class Line extends Graphic {

	@Override
	public void add(Graphic g) {
	}

	@Override
	public void remove(Graphic g) {
	}

	@Override
	public List<Graphic> getChildren() {
		return null;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Line");
	}
	
}
