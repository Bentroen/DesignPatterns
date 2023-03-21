
public class FactoryAnimal {

	public Animal getAnimal(String type) {
		if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cat")) {
			return new Cat();
		}
		return null;
	}
	
}
