
public class Main {

	
	public static void main(String[] args) {
		
		ConcretePrototype1 t1 = new ConcretePrototype1();
		ConcretePrototype2 t2 = new ConcretePrototype2();
		
		doSomething(t1);
		doSomething(t2);
		
	}
	
	public static void doSomething(Prototype o) {
		Prototype p = o.clone();
		
		if (p instanceof ConcretePrototype1) {
			ConcretePrototype1 p1 = (ConcretePrototype1) p;
		} else if (p instanceof ConcretePrototype2) {
			ConcretePrototype2 p2 = (ConcretePrototype2) p;
		}
		
		// ...
	}
	
}
