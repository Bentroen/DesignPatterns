package model;

import scaling.Strategy;

public class Image {

	public void resize(Strategy filter, int width, int height) {
		System.out.println("Resizing image using " + filter.getClass().toString());
		filter.resize(this, width, height);
	}
	
	
}
