package scaling;

import model.Image;

public class LanczosStrategy extends Strategy {

	@Override
	public void resize(Image img, int width, int height) {
		System.out.println("Performing Lanczos interpolation");
	}
	
}
