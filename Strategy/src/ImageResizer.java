import model.Image;
import scaling.NearestNeighborStrategy;
import scaling.Strategy;

public class ImageResizer {

	enum Filter {NEAREST, BICUBIC, BILINEAR, LANCZOS};
	
	private Strategy strategy;
	
	public ImageResizer() {
		strategy = new NearestNeighborStrategy();
	}
	
	public void setStrategy(Strategy st) {
		this.strategy = st;
	}
	
	public void resizeImage(Image img, int width, int height) {
		img.resize(this.strategy, width, height);
	}
}
