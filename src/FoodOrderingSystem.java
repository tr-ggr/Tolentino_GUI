import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel panel;

    FoodOrderingSystem(){

        setContentPane(panel);
        btnOrder.addActionListener(new ActionListener() {
            int sum = 0;
            double discount = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cPizza.isSelected()) sum += 100;
                if(cBurger.isSelected()) sum += 80;
                if(cFries.isSelected()) sum += 65;
                if(cSoftDrinks.isSelected()) sum += 55;
                if(cTea.isSelected()) sum += 50;
                if(cSundae.isSelected()) sum += 40;

                if(rbNone.isSelected()){
                    discount = 0;
                }
                if(rb5.isSelected()){
                    discount = 0.05;
                }
                if(rb10.isSelected()){
                    discount = 0.10;
                }
                if(rb15.isSelected()){
                    discount = 0.15;
                }

                double amount = sum - (sum * discount);

                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", amount));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();

        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
