
public class Dog extends Animal {

	public Dog() {
		System.out.println("Hi dog");
	}
	
	@Override
	public void walk() {
		System.out.println("Dog running");
	}

	@Override
	public void say() {
		System.out.println("Dog barking");
	}
	
}
