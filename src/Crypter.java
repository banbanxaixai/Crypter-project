/**
 * @author Raido Roomets <raido.roomets@cs.tamk.fi>
 * @author Roope Rantanen <roope.rantanen@cs.tamk.fi>
 * @version 2014-1022
 * @since 1.7
 */
public class Crypter {
 
	/**
	 * Array of alphabets and numbers.
	 */
    private static char[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
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
 
            System.out.print(toMorse(aakkoset, morse, args[i]));
 
        }
    }
 
    public static String toMorse(String[] aakkoset, String[] morse,
            String morseString) {
        String alphabeth = "";
 
        for (int i = 0; i < morse.length; i++) {
            if (morseString.equals(morse[i])) {
                alphabeth = aakkoset[i];
            }
        }
 
        return alphabeth;
    }
}
