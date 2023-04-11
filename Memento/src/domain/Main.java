package domain;

public class Main {

	public static void main(String[] args) {
		
		Originator o = new Originator();
		Caretaker ct = new Caretaker(o);
		
		ct.saveState(); // State 1
		
		o.addItem("A");
		o.addItem("B");
		o.addItem("C");
		ct.saveState(); // State 2
		
		o.removeItem();
		o.addItem("X");
		o.addItem("Y");
		ct.saveState(); // State 3
		o.addItem("Z");
		
		ct.undo();
		ct.undo();
		ct.undo();
	}
	
}
