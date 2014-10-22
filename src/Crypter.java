/**
 * @author Raido Roomets <raido.roomets@cs.tamk.fi>
 * @author Roope Rantanen <roope.rantanen@cs.tamk.fi>
 * @author Anton Peltoniemi <anton.peltoniemi@cs.tamk.fi>
 * @version 2014-1022
 * @since 1.7
 */
public class Crypter {
 
	/**
	 * Array of upper case alphabets and numbers.
	 */
    private static char[] characters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", " " };

	/**
	 * Array of crypted figures.
	 *
	 * Each figure represents a character and is on the same index as
	 * its counterpart in alphabets array.
	 */
	private static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", " " };

	public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
 
            System.out.print(toMorse(characters, morse, args[i]));
 
        }
    }
 
    public static String toMorse(String[] characters, String[] morse,
            String morseString) {
        String alphabet = "";
 
        for (int i = 0; i < morse.length; i++) {
            if (morseString.equals(morse[i])) {
                alphabet = characters[i];
            }
        }
 
        return alphabet;
    }
}
