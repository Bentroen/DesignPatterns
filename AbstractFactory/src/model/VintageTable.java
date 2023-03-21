package model;

public class VintageTable implements Table {

	@Override
	public int seatCount() {
		return 4;
	}

	@Override
	public void setTable() {
		System.out.println("Setting the vintage table");
	}
	
}
