/**
 * @author Raido Roomets <raido.roomets@cs.tamk.fi>
 * @author Roope Rantanen <roope.rantanen@cs.tamk.fi>
 * @author Anton Peltoniemi <anton.peltoniemi@cs.tamk.fi>
 * @version 2014-1023
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

	/**
	 * Returns parameter text as crypted version of the text.
	 * 
	 * When a text string is received as a parameter every character
	 * from that string is compared to the alphabets array and once found
	 * the matching crypted character is added to a string variable. This
	 * will form an exact copy of the original text but in crypted form.
	 *
	 * @param originalText text the user has entered
	 * @return cryptedText parameter string in crypted form
	 */
    public static String toMorse(String originalText) {
        String cryptedText = "";
		String upperCasedText = originalText.toUpperCase();

        for (int j = 0;j<upperCasedText.length();j++) {

            for (int i = 0; i < characters.length; i++) {
                if (upperCasedText.charAt(j) == characters[i]) {
                    cryptedText = cryptedText + " " + morse[i];
                }
            }
        }

        return cryptedText;
    }
}
