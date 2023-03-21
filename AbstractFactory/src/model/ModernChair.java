package model;

public class ModernChair implements Chair {

	@Override
	public boolean hasLegs() {
		return false;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting in a modern chair");
	}
	
}
