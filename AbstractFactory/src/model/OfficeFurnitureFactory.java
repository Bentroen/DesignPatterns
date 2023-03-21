package model;

public class OfficeFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new OfficeChair();
	}

	@Override
	public Table createTable() {
		return new OfficeTable();
	}

	@Override
	public Sofa createSofa() {
		return new OfficeSofa();
	}

}
