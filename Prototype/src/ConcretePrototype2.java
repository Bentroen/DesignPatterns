public class ConcretePrototype2 implements Prototype {
	
	@Override
	public Prototype clone() {
		System.out.println("Cloning " + this.getClass().getName());
		return new ConcretePrototype2();
	}
	
}
