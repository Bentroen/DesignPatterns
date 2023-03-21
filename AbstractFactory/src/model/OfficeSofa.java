package model;

public class OfficeSofa implements Sofa {

	@Override
	public int seatCount() {
		return 2;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting in an office sofa");
	}

}
