package scaling;

import model.Image;

public class BicubicStrategy extends Strategy {

	@Override
	public void resize(Image img, int width, int height) {
		System.out.println("Performing Bicubic interpolation");
	}
	
}
