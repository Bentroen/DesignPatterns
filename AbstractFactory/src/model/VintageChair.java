package model;

public class VintageChair implements Chair {

	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting in a vintage chair");
	}
	
}
