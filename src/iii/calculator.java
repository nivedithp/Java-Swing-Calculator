package iii;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {

    JFrame jf;
    JLabel displaylabel;

    JButton sevenButton, eightButton, nineButton;
    JButton fourButton, fiveButton, sixButton;
    JButton oneButton, twoButton, threeButton;
    JButton dotButton, zeroButton, equalButton;
    JButton division, multiplication, addition, substraction;
    JButton clearbutton;

    double num1, num2, result;
    String operator;

    boolean isOperatorClicked = false;

    public calculator() {

        jf = new JFrame("Calculator");

        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(250, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displaylabel = new JLabel("");
        displaylabel.setBounds(30, 50, 540, 40);
        displaylabel.setBackground(Color.gray);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setOpaque(true);
        displaylabel.setForeground(Color.white);
        displaylabel.setFont(new Font("Arial", Font.PLAIN, 25));

        jf.add(displaylabel);

        sevenButton = createButton("7", 30, 130);
        eightButton = createButton("8", 130, 130);
        nineButton = createButton("9", 230, 130);

        fourButton = createButton("4", 30, 230);
        fiveButton = createButton("5", 130, 230);
        sixButton = createButton("6", 230, 230);

        oneButton = createButton("1", 30, 330);
        twoButton = createButton("2", 130, 330);
        threeButton = createButton("3", 230, 330);

        dotButton = createButton(".", 30, 430);
        zeroButton = createButton("0", 130, 430);
        equalButton = createButton("=", 230, 430);

        division = createButton("/", 330, 130);
        multiplication = createButton("*", 330, 230);
        addition = createButton("+", 330, 330);
        substraction = createButton("-", 330, 430);

        clearbutton = createButton("C", 430, 430);

        jf.setVisible(true);
    }

    public JButton createButton(String text, int x, int y) {

        JButton button = new JButton(text);
        button.setBounds(x, y, 80, 80);
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        button.addActionListener(this);

        jf.add(button);

        return button;
    }

    public static void main(String[] args) {

        calculator c = new calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // NUMBER BUTTONS

        if (e.getSource() == sevenButton) {

            if (isOperatorClicked) {
                displaylabel.setText("7");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "7");
            }

        } else if (e.getSource() == eightButton) {

            if (isOperatorClicked) {
                displaylabel.setText("8");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "8");
            }

        } else if (e.getSource() == nineButton) {

            if (isOperatorClicked) {
                displaylabel.setText("9");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "9");
            }

        } else if (e.getSource() == fourButton) {

            if (isOperatorClicked) {
                displaylabel.setText("4");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "4");
            }

        } else if (e.getSource() == fiveButton) {

            if (isOperatorClicked) {
                displaylabel.setText("5");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "5");
            }

        } else if (e.getSource() == sixButton) {

            if (isOperatorClicked) {
                displaylabel.setText("6");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "6");
            }

        } else if (e.getSource() == oneButton) {

            if (isOperatorClicked) {
                displaylabel.setText("1");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "1");
            }

        } else if (e.getSource() == twoButton) {

            if (isOperatorClicked) {
                displaylabel.setText("2");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "2");
            }

        } else if (e.getSource() == threeButton) {

            if (isOperatorClicked) {
                displaylabel.setText("3");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "3");
            }

        } else if (e.getSource() == zeroButton) {

            if (isOperatorClicked) {
                displaylabel.setText("0");
                isOperatorClicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "0");
            }

        } else if (e.getSource() == dotButton) {

            if (isOperatorClicked) {
                displaylabel.setText("0.");
                isOperatorClicked = false;
            } else if (!displaylabel.getText().contains(".")) {
                displaylabel.setText(displaylabel.getText() + ".");
            }

        }

        // OPERATORS

        else if (e.getSource() == addition) {

            num1 = Double.parseDouble(displaylabel.getText());
            operator = "+";
            isOperatorClicked = true;

        } else if (e.getSource() == substraction) {

            num1 = Double.parseDouble(displaylabel.getText());
            operator = "-";
            isOperatorClicked = true;

        } else if (e.getSource() == multiplication) {

            num1 = Double.parseDouble(displaylabel.getText());
            operator = "*";
            isOperatorClicked = true;

        } else if (e.getSource() == division) {

            num1 = Double.parseDouble(displaylabel.getText());
            operator = "/";
            isOperatorClicked = true;

        }

        // EQUAL BUTTON

        else if (e.getSource() == equalButton) {

            try {

                num2 = Double.parseDouble(displaylabel.getText());

                switch (operator) {

                    case "+":
                        result = num1 + num2;
                        break;

                    case "-":
                        result = num1 - num2;
                        break;

                    case "*":
                        result = num1 * num2;
                        break;

                    case "/":

                        if (num2 == 0) {
                            displaylabel.setText("Cannot divide by zero");
                            return;
                        }

                        result = num1 / num2;
                        break;

                    default:
                        return;
                }

                displaylabel.setText(String.valueOf(result));

                isOperatorClicked = true;
                operator = null;

            } catch (Exception ex) {

                displaylabel.setText("Error");

            }

        }

        // CLEAR BUTTON

        else if (e.getSource() == clearbutton) {

            displaylabel.setText("");

            num1 = 0;
            num2 = 0;
            result = 0;

            operator = null;
            isOperatorClicked = false;

        }

    }
}