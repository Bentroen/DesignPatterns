import java.util.ArrayList;
import java.util.List;

import flyweight.CharacterFactory;
import flyweight.CharacterFlyweight;

public class Main {

	public static void main(String[] args) {
		String text = "This is an example text with repeated letters";
		
		List<CharacterFlyweight> chars = new ArrayList<>();
		for (char c : text.toCharArray()) {
			chars.add(CharacterFactory.getFlyweight(c));
		}
		
		for (CharacterFlyweight characterFlyweight : chars) {
			characterFlyweight.print("|");
		}
		
		System.out.println();
		System.out.println("Text length: " + text.length());
		System.out.println("Instance count: " + CharacterFlyweight.getInstanceCount());
	}
	
}
