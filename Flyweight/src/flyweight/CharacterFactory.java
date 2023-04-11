package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

	private static Map<Character, CharacterFlyweight> flyweight = new HashMap<>();
	
	public static CharacterFlyweight getFlyweight(char c) {
		CharacterFlyweight ret = null;
		if (flyweight.get(c) == null) {
			ret = new CharacterFlyweight(c);
			flyweight.put(c, ret);
		} else {
			ret = flyweight.get(c);
		}
		return ret;
	}
	
}
