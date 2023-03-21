package model;

public class OfficeChair implements Chair {

	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting in a vintage chair");
	}
	
}
