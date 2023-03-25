package scaling;

import model.Image;

public class NearestNeighborStrategy extends Strategy {

	@Override
	public void resize(Image img, int width, int height) {
		System.out.println("Performing Nearest Neighbor interpolation");
	}
	
}
