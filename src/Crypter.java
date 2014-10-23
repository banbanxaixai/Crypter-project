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
    private static char[] characters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', '0', ' ' };

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

	/**
	 * Initializes a crypter object when one is created.
	 */
	public Crypter() {

	}

    public static String toMorse(String originalText) {
        String cryptedText = "";

        for (int j = 0;j<originalText.length();j++) {

            for (int i = 0; i < characters.length; i++) {
                if (originalText.charAt(j) == characters[i]) {
                    cryptedText = cryptedText + " " + morse[i];
                }
            }
        }

        return cryptedText;
    }
}
