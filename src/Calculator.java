import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel panel;
    private JLabel lblResult;

    public Calculator(){
        setContentPane(panel);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operator = (String) cbOperations.getSelectedItem();
                double num1 = Integer.parseInt(tfNumber1.getText());
                double num2 = Integer.parseInt(tfNumber2.getText());

                switch(operator){
                    case "+":
                        lblResult.setText(String.format("%.2f", num1+num2));
                        break;
                    case "-":
                        lblResult.setText(String.format("%.2f", num1-num2));
                        break;
                    case "/":
                        lblResult.setText(String.format("%.2f", num1/num2));
                        break;
                    case "*":
                        lblResult.setText(String.format("%.2f", num1*num2));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();

        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
