import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.time.Year.isLeap;

public class LeapYearChecker extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel InputYear;
    private JPanel panel;

    public LeapYearChecker() {
        setContentPane(panel);

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    long year = Long.parseLong(tfYear.getText());
                    if(year < 0) throw new NumberFormatException();

                    System.out.println(year);

                    //                if(year) JOptionPane.showMessageDialog(null, "Enter a valid number!");

                    if (isLeap(year) == true) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number!");

                }
            }
        });
    }

        public static void main(String[]args){
            LeapYearChecker app = new LeapYearChecker();

            app.setSize(1000, 600);
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
            app.setTitle("Leap Year Checker");
            app.setVisible(true);
        }
}
