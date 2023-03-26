package components;

import templates.Subject;

public class TableViewSubject extends Subject {
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
		notifyObservers(this.value);
	}

}
