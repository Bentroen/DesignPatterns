package model;

public class ModernTable implements Table {

	@Override
	public int seatCount() {
		return 6;
	}

	@Override
	public void setTable() {
		System.out.println("Setting the modern table");
	}
	
}
