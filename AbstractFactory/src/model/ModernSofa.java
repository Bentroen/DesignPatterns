package model;

public class ModernSofa implements Sofa {

	@Override
	public int seatCount() {
		return 3;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting in a modern sofa");
	}

}
