/**
 * @author Raido Roomets <raido.roomets@cs.tamk.fi>
 * @author Roope Rantanen <roope.rantanen@cs.tamk.fi>
 * @author Anton Peltoniemi <anton.peltoniemi@cs.tamk.fi>
 * @version 2014-1023
 * @since 1.7
 */
public class App {

	/**
	 * Starts the application.
	 * 
	 * Initializes a GUI which starts the Crypter application.
	 *
	 * @param args default parameter, not used
	 */
    public static void main(String[] args) {

        GUI window = new GUI("CRYPTERIZER");
		
        window.setVisible(true);
    }
}
