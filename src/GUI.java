import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class GUI extends JFrame {

    private JButton switchButton;
    private JButton resetButton;
    private JButton cryptButton;
    private JButton decryptButton;
    private JButton toTextButton;
    private JTextArea originalText;
    private JTextArea cryptedText;
    private JPanel upperArea;
    private JPanel middleArea;
    private Crypter crypter;
    private int indicator = 1;

    public GUI() {

        super();
    }
    public GUI(String title) {

        super(title);


        this.setSize(900, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout bLayout = new BorderLayout();
        FlowLayout fLayout = new FlowLayout(FlowLayout.CENTER, 20, 10);

        setLayout(bLayout);

        upperArea = new JPanel();

        upperArea.setLayout(fLayout);
        upperArea.setBackground(new Color(80,80,100) );


        /** painike jota painamalla tekstikentät tyhjenevät */
        resetButton = new JButton("RESET");

        switchButton = new JButton("Switch");
        /** keskelle sijoitettava JPanel jonka sisälle wräpätään tekstialueet ja painike */
        middleArea = new JPanel();
        middleArea.setBackground(new Color(80,80,100));
        middleArea.setLayout(fLayout);

        originalText = new JTextArea(15, 30);
        Border bordergreen = BorderFactory.createLineBorder(Color.green);
        Border bordermagenta = BorderFactory.createLineBorder(Color.magenta);
        originalText.setBorder(bordergreen);

        cryptButton = new JButton("TEXT TO CODE");
        decryptButton = new JButton("CODE TO TEXT");
        toTextButton = new JButton("Export to Text File");
        crypter = new Crypter();

        cryptedText = new JTextArea(15, 30);
        cryptedText.setBorder(bordermagenta);

        upperArea.add(cryptButton);
        upperArea.add(switchButton);
        upperArea.add(toTextButton);

        /** Lisätään JPaneliin järjestyksessä 'elementit' */
        middleArea.add(originalText);

        middleArea.add(cryptedText);

        add(upperArea, bLayout.PAGE_START);
        add(resetButton, bLayout.PAGE_END);
        add(middleArea, bLayout.CENTER);

        toTextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Execute when button is pressed}}
                String toTextFile = cryptedText.getText();
                System.out.println(toTextFile);
                try (PrintStream out = new PrintStream(new FileOutputStream("code.txt"))) {
                    out.print(toTextFile);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Execute when button is pressed}
                originalText.setText("");
                cryptedText.setText("");
           }
        });

        cryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Execute when button is pressed}}

                cryptedText.setText(crypter.toMorse(originalText.getText()));
            }
        });

        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Execute when button is pressed}}
                if(indicator > 0) {
                upperArea.remove(cryptButton);
                upperArea.remove(switchButton);
                upperArea.remove(toTextButton);
                upperArea.add(decryptButton);
                upperArea.add(switchButton);
                upperArea.add(toTextButton);
                upperArea.updateUI();
                indicator = indicator * -1;
                } else if(indicator < 0) {
                    upperArea.remove(decryptButton);
                    upperArea.remove(switchButton);
                    upperArea.remove(toTextButton);
                    upperArea.add(cryptButton);
                    upperArea.add(switchButton);
                    upperArea.add(toTextButton);
                    upperArea.updateUI();
                    indicator = indicator * -1;
                }
                originalText.setText(cryptedText.getText());
                cryptedText.setText("");
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Execute when button is pressed}}

                cryptedText.setText(crypter.toAlphabets(originalText.getText()));
            }
        });
    }
}
