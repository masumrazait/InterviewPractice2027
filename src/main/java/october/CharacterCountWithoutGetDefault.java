package october;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountWithoutGetDefault {
	public static void main(String[] args) {
		String str = "masumraza";
		Map<Character, Integer> charCo = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (charCo.containsKey(c)) {
				charCo.put(c, charCo.get(c) + 1);
			} else {
				charCo.put(c, 1);
			}
		}
		System.out.println(charCo);
	}

}
