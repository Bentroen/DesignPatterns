package model;

public class VintageSofa implements Sofa {

	@Override
	public int seatCount() {
		return 1;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting in a vintage sofa");
	}

}
