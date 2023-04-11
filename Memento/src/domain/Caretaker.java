package domain;

import java.util.Stack;

public class Caretaker {

	private Stack<Memento> states = new Stack<Memento>();
	
	private Originator o;
	
	public Caretaker(Originator o) {
		this.o = o;
	}
	
	public void saveState() {
		states.push(o.createMemento());
	}
	
	public void undo() {
		o.setMemento(states.pop());
	}
	
}
