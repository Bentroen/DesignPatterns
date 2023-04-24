public class ConcretePrototype1 implements Prototype {

	private String id;
	private String name;
	private String value;
	
	@Override
	public Prototype clone() {
		System.out.println("Cloning " + this.getClass().getName());
		ConcretePrototype1 clone = new ConcretePrototype1();
		clone.setId(this.id);
		clone.setName(name);
		clone.setValue(value);
		return clone;
	}
	
	// ----------------------------
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
