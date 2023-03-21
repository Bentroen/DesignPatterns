
public class Main {

	public static void main(String[] args) {
		FactoryAnimal factory = new FactoryAnimal();
		
		Animal animal1 = factory.getAnimal("cat");
		Animal animal2 = factory.getAnimal("dog");
		
		animal1.walk();
		animal2.say();
	}
	
}
