package model;

public class OfficeTable implements Table {

	@Override
	public int seatCount() {
		return 8;
	}

	@Override
	public void setTable() {
		System.out.println("Setting the office table");
	}
	
}
