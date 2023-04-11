package domain;

public class Originator {

	private String state = "";
	
	public Memento createMemento() {
		System.out.println("Saved state: " + state);
		return new Memento(state);
	}
	
	public void setMemento(Memento m) {
		this.state = m.getState();
		System.out.println("Restored state: " + state);
	}
	
	public void addItem(String item) {
		this.state = this.state + item;
	}
	
	public void removeItem() {
		this.state = this.state.substring(0, this.state.length() - 1);
	}
}
