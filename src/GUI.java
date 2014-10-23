import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends JFrame {

    private JButton startButton;
    private JButton resetButton;
    private JButton cryptButton;
    private JTextArea originalText;
    private JTextArea cryptedText;
    private JPanel middleArea;

    public GUI() {

        super();

        this.setSize(900, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout bLayout = new BorderLayout();
        FlowLayout fLayout = new FlowLayout();

        setLayout(bLayout);

        startButton = new JButton("START");

        System.out.println(getHeight());

        /** painike jota painamalla tekstikentät tyhjenevät */
        resetButton = new JButton("RESET");

        /** keskelle sijoitettava JPanel jonka sisälle wräpätään tekstialueet ja painike */
        middleArea = new JPanel();

        middleArea.setLayout(fLayout);

        originalText = new JTextArea(15, 30);

        cryptButton = new JButton("Crypt it!");

        cryptedText = new JTextArea(15, 30);

        /** Lisätään JPaneliin järjestyksessä 'elementit' */
        middleArea.add(originalText);
        middleArea.add(cryptButton);
        middleArea.add(cryptedText);

        add(resetButton, bLayout.PAGE_END);
        add(middleArea, bLayout.CENTER);

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Execute when button is pressed}
                System.out.println("You clicked the button");
                originalText.setText("");
                cryptedText.setText("");
           }
        });
    }
}
