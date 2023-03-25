package scaling;

import model.Image;

public abstract class Strategy {

	public abstract void resize(Image img, int width, int height);
	
}
