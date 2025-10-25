package Module4;
import javax.swing.*;
import java.awt.*;

public class PHA_M4_Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // main background
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBackground(Color.BLUE);
        frame.setContentPane(mainPanel);

        // text field on top
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(textField, BorderLayout.NORTH);

        // button grid in center
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        buttonPanel.setBackground(Color.BLUE);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // equal button at bottom
        JButton equButton = new JButton("=");
        equButton.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(equButton, BorderLayout.SOUTH);

        JButton[] numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            int num = i;
            numberButtons[i] = new JButton(String.valueOf(num));
            numberButtons[i].addActionListener(e -> textField.setText(textField.getText() + num));
        }

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton clrButton = new JButton("C");

        buttonPanel.add(addButton);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(subButton);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(mulButton);
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(divButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(clrButton);

        // logic
        final double[] num1 = new double[1];
        final char[] operator = new char[1];

        addButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(textField.getText());
            operator[0] = '+';
            textField.setText(textField.getText() + "+");
        });
        subButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(textField.getText());
            operator[0] = '-';
            textField.setText(textField.getText() + "-");
        });
        mulButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(textField.getText());
            operator[0] = '*';
            textField.setText(textField.getText() + "*");
        });
        divButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(textField.getText());
            operator[0] = '/';
            textField.setText(textField.getText() + "/");
        });

        clrButton.addActionListener(e -> textField.setText(""));

        equButton.addActionListener(e -> {
            try {
                String text = textField.getText();
                String[] parts = text.split("[+\\-*/]");
                if (parts.length < 2) return;
                double num2 = Double.parseDouble(parts[1]);
                double result = switch (operator[0]) {
                    case '+' -> num1[0] + num2;
                    case '-' -> num1[0] - num2;
                    case '*' -> num1[0] * num2;
                    case '/' -> num1[0] / num2;
                    default -> 0;
                };
                textField.setText(text + "=" + result);
            } catch (Exception ex) {
                textField.setText("Error");
            }
        });

        frame.setVisible(true);
    }
}
