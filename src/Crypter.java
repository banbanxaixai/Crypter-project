public class Crypter {
 
    public static void main(String[] args) {
 
        String[] aakkoset = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", " " };
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", " " };
 
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