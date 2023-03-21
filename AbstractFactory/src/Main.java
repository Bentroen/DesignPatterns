import java.util.ArrayList;
import java.util.List;

import model.FurniturePiece;
import model.Chair;
import model.FurnitureFactory;
import model.ModernFurnitureFactory;
import model.OfficeFurnitureFactory;
import model.Sofa;
import model.Table;
import model.VintageFurnitureFactory;

public class Main {

	public static void main(String[] args) {
		
		FurnitureFactory factory1 = new ModernFurnitureFactory();
		FurnitureFactory factory2 = new VintageFurnitureFactory();
		FurnitureFactory factory3 = new OfficeFurnitureFactory();
		
		List<FurniturePiece> furnitureSet1 = getFurnitureSet(factory1);
		List<FurniturePiece> furnitureSet2 = getFurnitureSet(factory2);
		List<FurniturePiece> furnitureSet3 = getFurnitureSet(factory3);
		
		Chair myChair = (Chair) furnitureSet1.get(0);
		Sofa mySofa = (Sofa) furnitureSet2.get(1);
		Table myTable = (Table) furnitureSet3.get(2);
		
		myChair.sitOn();
		mySofa.sitOn();
		myTable.setTable();
		
	}
	
	public static List<FurniturePiece> getFurnitureSet(FurnitureFactory factory) {
		List<FurniturePiece> arr = new ArrayList<>();
		arr.add(factory.createChair());
		arr.add(factory.createSofa());
		arr.add(factory.createTable());
		return arr;
	};
	
}
