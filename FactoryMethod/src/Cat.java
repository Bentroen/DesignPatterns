
public class Cat extends Animal {

	public Cat() {
		System.out.println("Hi cat");
	}

	@Override
	public void walk() {
		System.out.println("Cat walking");
	}

	@Override
	public void say() {
		System.out.println("Cat meowing");
	}
	
}
