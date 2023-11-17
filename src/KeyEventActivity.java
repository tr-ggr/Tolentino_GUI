import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.lang.Character.toUpperCase;

public class KeyEventActivity extends JFrame{
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JLabel Editable;
    private JPanel panel;

    KeyEventActivity(){
        setContentPane(panel);

        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println(e.getKeyChar());
                System.out.println(e);

                switch(e.getKeyChar()){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        textArea2.append(String.valueOf(toUpperCase(e.getKeyChar())));
                        break;
                    default:
                        textArea2.append(String.valueOf(e.getKeyChar()));
                }
            }
        });
    }

    public static void main(String[] args) {
        KeyEventActivity app = new KeyEventActivity();

        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Key Event Class");
        app.setVisible(true);
    }
}
