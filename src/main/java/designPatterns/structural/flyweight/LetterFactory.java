package designPatterns.structural.flyweight;

import java.util.Hashtable;
import java.util.Map;

public class LetterFactory {

	private Map<String, Letter> letters = new Hashtable<String, Letter>();

	public Letter createLetter(String key) {
		Letter letter = letters.get(key);
		if (letter == null) {
			letter = new Letter(key);
			letters.put(key, letter);
		}
		return letters.get(key);
	}
}
