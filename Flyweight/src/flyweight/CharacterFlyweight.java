package flyweight;

public class CharacterFlyweight extends Flyweight {

	private static int instances = 0;
	
	private char c;
	
	CharacterFlyweight(char c) {
		this.c = c;
		instances++;
	}
	
	@Override
	public void print(String format) {
		System.out.print(c + format);
	}
	
	public static int getInstanceCount() {
		return instances;
	}

}
