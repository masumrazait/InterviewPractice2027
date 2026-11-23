package october;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "masumraza";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		System.out.println(charCount);
	}
}
