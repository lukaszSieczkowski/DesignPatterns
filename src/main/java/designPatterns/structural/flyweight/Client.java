package designPatterns.structural.flyweight;

/**
 * A flyweight is an object that minimizes memory usage by sharing as much data
 * as possible with other similar objects; it is a way to use objects in large
 * numbers when a simple repeated representation would use an unacceptable
 * amount of memory. Often some parts of the object state can be shared, and it
 * is common practice to hold them in external data structures and pass them to
 * the objects temporarily when they are used.
 *
 *
 */
public class Client {

	public static void main(String[] args) {
		WordProcessor procesor = new WordProcessor();
		String text = "Hello. I am aaaa wordldddd processsorrrrrr";

		LetterFactory factory = new LetterFactory();
		for (int i = 0; i < text.length(); i++) {
			String value = text.substring(i, i + 1);
			procesor.addLetter(factory.createLetter(value));
		}
		procesor.printLetters();
	}

}
