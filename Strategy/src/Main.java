import model.Image;
import scaling.BicubicStrategy;

public class Main {
	
	public static void main(String[] args) {
		
		ImageResizer resizer = new ImageResizer();
		
		// Nearest neighbor (default)
		resizer.resizeImage(new Image(), 256, 256);
	
		// Bicubic
		resizer.setStrategy(new BicubicStrategy());
		resizer.resizeImage(new Image(), 256, 256);
	}
	
}
