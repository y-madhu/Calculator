import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Calculator {
    private double firstnum;
    private double secondnum;
    private double value;
    private double value1;
    private double result;
    private double addnum;
    String operations;
    String answer;
    String text;
    String text1, text2, text3;

    private JPanel Calculator;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a7Button;
    private JButton button8;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton button12;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button15;
    private JButton a1Button;
    private JButton button17;
    private JButton a0Button;
    private JButton button19;
    private JButton button20;
    private JTextField textDisplay;
    private JButton lnButton;
    private JButton sqrtButton;
    private JButton cubertButton;
    private JButton tanButton;
    private JButton tan_1Button;
    private JButton log_2Button;
    private JButton sqButton;
    private JButton cubeButton;
    private JButton cosButton;
    private JButton cos_1Button;
    private JButton log_10Button;
    private JButton a10Button;
    private JButton a1XButton;
    private JButton sinButton;
    private JButton sin_1Button;
    private JButton piButton;
    private JButton nButton;
    private JRadioButton radianRadioButton;
    private JRadioButton degreeRadioButton;
    private JTextField textDisplay1;
    private JButton log_xButton;
    private JButton x_r_yButton;
    private JButton xYButton;
    private JTextArea textArea1;
    private JButton clearButton;
    private JButton ANSButton;
    private JLabel label;


    public Calculator() {

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText("");
                textDisplay1.setText("");
                label.setText("");
                firstnum = 0;
                secondnum = 0;
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a9Button.getText();
                textDisplay.setText(text);


            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a8Button.getText();
                textDisplay.setText(text);


            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a7Button.getText();
                textDisplay.setText(text);


            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a6Button.getText();
                textDisplay.setText(text);


            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a5Button.getText();
                textDisplay.setText(text);

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a4Button.getText();
                textDisplay.setText(text);


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a3Button.getText();
                textDisplay.setText(text);


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a2Button.getText();
                textDisplay.setText(text);


            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a1Button.getText();
                textDisplay.setText(text);

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = textDisplay.getText() + a0Button.getText();
                textDisplay.setText(text);

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = textDisplay1.getText() + textDisplay.getText() + button4.getText();
                textDisplay1.setText(text1);
                firstnum = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operations = "/";

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = textDisplay1.getText() + textDisplay.getText() + button8.getText();
                textDisplay1.setText(text1);
                firstnum = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operations = "*";
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textDisplay.getText().equals("")) {
                    text1 = textDisplay.getText() + button12.getText();
                    textDisplay.setText(text1);
                } else {
                    text1 = textDisplay1.getText() + textDisplay.getText() + button12.getText();
                    textDisplay1.setText(text1);
                }
                firstnum = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operations = "-";
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay1.getText() != textDisplay.getText()) {
                    text1 = textDisplay1.getText() + button15.getText();
                    textDisplay1.setText(text1);
                } else {
                    text1 = textDisplay1.getText() + textDisplay.getText() + button15.getText();
                    textDisplay1.setText(text1);
                }
                firstnum = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operations = "+";

                //

            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                } else if (textDisplay.getText().contains(".")) {
                    button19.setEnabled(false);
                } else {
                    text = textDisplay.getText() + button19.getText();
                    textDisplay.setText(text);
                }
                button19.setEnabled(true);
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = value / 100;
                textDisplay.setText(String.valueOf(value));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = value * (-1);
                textDisplay.setText(String.valueOf(value));
                text1 = "-" + textDisplay.getText();
                textDisplay1.setText(text1);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (textDisplay.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(textDisplay.getText());
                    strB.deleteCharAt(textDisplay.getText().length() - 1);
                    backspace = strB.toString();
                    textDisplay.setText(backspace);
                }
            }
        });
        sqButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = textDisplay1.getText() + textDisplay.getText() + "^2";
                textDisplay1.setText(text1);
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                firstnum = value * value;
                textDisplay.setText(String.valueOf(firstnum));
                textDisplay.setEnabled(false);
                //textDisplay.setText("");
            }
        });
        cubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = value * value * value;
                textDisplay.setText(String.valueOf(value));
                text1 = textDisplay1.getText() + "^3";
                textDisplay1.setText(text1);
            }
        });
        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                double power = Math.pow(10, value);
                textDisplay.setText(String.valueOf(power));
                text1 = "10^" + value;
                textDisplay1.setText(text1);


            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = Math.sqrt(value);
                textDisplay.setText(String.valueOf(value));
                text1 = textDisplay1.getText() + "^(1/2)";
                textDisplay1.setText(text1);
            }
        });
        cubertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = Math.cbrt(value);
                textDisplay.setText(String.valueOf(value));
                text1 = textDisplay1.getText() + "^(1/3)";
                textDisplay1.setText(text1);
            }
        });
        nButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = (int) value;
                int fact = 1;
                for (int k = 1; k <= value; k++) {
                    fact = fact * k;
                }
                textDisplay.setText(String.valueOf(fact));
                text1 = textDisplay1.getText() + "!";
                textDisplay1.setText(text1);
            }
        });
        log_10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = Math.log10(value);
                textDisplay.setText(String.valueOf(value));
                text1 = "log_b_10(" + textDisplay1.getText() + ")";
                textDisplay1.setText(text1);
            }
        });
        log_2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = Math.log10(value);
                value1 = Math.log10(2);
                value = value / value1;
                textDisplay.setText(String.valueOf(value));
                text1 = "log_b_2(" + textDisplay1.getText() + ")";
                textDisplay1.setText(text1);
            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = Math.log(value);
                textDisplay.setText(String.valueOf(value));
                text1 = "ln(" + textDisplay1.getText() + ")";
                textDisplay1.setText(text1);
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                if (value % 180 == 0) {
                    value = 0;
                }
                if (degreeRadioButton.isSelected()) {
                    value = Math.toRadians(value);
                    value = Math.sin(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "sin_d_(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                } else if (radianRadioButton.isSelected()) {
                    value = Math.sin(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "sin_r_(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }

            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));

                if (degreeRadioButton.isSelected()) {
                    value = Math.toRadians(90 - value);
                    value = Math.sin(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "cos_d_(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                } else if (radianRadioButton.isSelected()) {
                    value = Math.cos(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "cos_r_(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                if (degreeRadioButton.isSelected()) {
                    value = Math.toRadians(value);
                    value = Math.tan(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "tan_d_(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                } else if (radianRadioButton.isSelected()) {
                    value = Math.tan(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "tan_r_(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }
            }
        });
        sin_1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));

                if (degreeRadioButton.isSelected()) {
                    value = Math.toRadians(value);
                    value = Math.asin(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "sin_d_^-1(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                } else if (radianRadioButton.isSelected()) {
                    value = Math.asin(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "sin_r_^-1(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }

            }
        });
        cos_1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                if (degreeRadioButton.isSelected()) {
                    value = Math.toRadians(value);
                    value = Math.acos(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "cos_d_^-1(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                } else if (radianRadioButton.isSelected()) {
                    value = Math.acos(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "sin_r_^-1(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }
            }
        });
        tan_1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                if (degreeRadioButton.isSelected()) {
                    value = Math.toRadians(value);
                    value = Math.atan(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "tan_d_^-1(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                } else if (radianRadioButton.isSelected()) {
                    value = Math.atan(value);
                    textDisplay.setText(String.valueOf(value));
                    text1 = "tan_r_^-1(" + textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }

            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = 1 / value;
                textDisplay.setText(String.valueOf(value));
                text1 = textDisplay1.getText() + "^-1";
                textDisplay1.setText(text1);
                //textDisplay.setText(String.valueOf(value));
            }
        });
        piButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pi_ = 3.141592653589793;
                answer = String.valueOf(pi_);
                textDisplay.setText(answer);
                text1 = textDisplay1.getText() + answer;
                textDisplay1.setText(text1);
            }
        });
        xYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operations = "^";
                text1 = "(" + textDisplay1.getText() + ")^";
                textDisplay1.setText(text1);
            }
        });
        x_r_yButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operations = "_r_";
                text1 = "(" + textDisplay1.getText() + ")_r_";
                textDisplay1.setText(text1);

            }
        });
        log_xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(String.valueOf(textDisplay.getText()));
                value = Math.log10(value);
                textDisplay.setText("");
                operations = "log_x_";
                text1 = "log_" + textDisplay1.getText() + "_(";
                textDisplay1.setText(text1);

            }
        });


        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondnum = Double.parseDouble(textDisplay.getText());
                textDisplay1.setText(textDisplay1.getText() + secondnum);
                if (operations == "+") {
                    firstnum = firstnum + secondnum;
                    answer = String.valueOf(firstnum);
                    textDisplay.setText(answer);
                } else if (operations == "-") {
                    firstnum = firstnum - secondnum;
                    answer = String.valueOf(firstnum);
                    textDisplay.setText(answer);
                } else if (operations == "*") {
                    firstnum = firstnum * secondnum;
                    answer = String.valueOf(firstnum);
                    textDisplay.setText(answer);
                } else if (operations == "/") {
                    firstnum = firstnum / secondnum;
                    answer = String.valueOf(firstnum);
                    textDisplay.setText(answer);
                } else if (operations == "=") {
                    firstnum = Double.parseDouble(textDisplay.getText());
                    answer = String.valueOf(firstnum);
                    textDisplay.setText(answer);
                } else if (operations == "^") {
                    double result = 1;
                    for (int k = 1; k <= secondnum; k++) {
                        result = result * value;
                    }
                    answer = String.valueOf(result);
                    textDisplay.setText(answer);
                } else if (operations == "_r_") {
                    result = Math.pow(secondnum, 1 / value);
                    answer = String.valueOf(result);
                    textDisplay.setText(answer);
                } else if (operations == "log_x_") {
                    value1 = Math.log10(secondnum);
                    value = value1 / value;
                    textDisplay.setText(String.valueOf(value));
                    text1 = textDisplay1.getText() + ")";
                    textDisplay1.setText(text1);
                }
                textArea1.setText(textArea1.getText() + textDisplay1.getText() + "=" + textDisplay.getText() + "\n");
                label.setText(textDisplay1.getText() + "=" + textDisplay.getText());
                textDisplay1.setText("");
                textDisplay.setText("");

            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                textDisplay.setText("");
                textDisplay1.setText("");
                label.setText("");

            }
        });
        ANSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay1.setText(textDisplay.getText());
                textDisplay.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Calculator = new JPanel();
        Calculator.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(11, 12, new Insets(20, 20, 20, 20), 1, 1));
        Calculator.setMaximumSize(new Dimension(214748, 214748));
        Calculator.setMinimumSize(new Dimension(600, 300));
        Calculator.setPreferredSize(new Dimension(1350, 675));
        ACButton = new JButton();
        ACButton.setText("AC");
        Calculator.add(ACButton, new com.intellij.uiDesigner.core.GridConstraints(6, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button2 = new JButton();
        button2.setHorizontalTextPosition(0);
        button2.setText("<--");
        Calculator.add(button2, new com.intellij.uiDesigner.core.GridConstraints(6, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button3 = new JButton();
        button3.setText("+/-");
        Calculator.add(button3, new com.intellij.uiDesigner.core.GridConstraints(6, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button4 = new JButton();
        button4.setText("/");
        Calculator.add(button4, new com.intellij.uiDesigner.core.GridConstraints(6, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        final JToolBar.Separator toolBar$Separator1 = new JToolBar.Separator();
        Calculator.add(toolBar$Separator1, new com.intellij.uiDesigner.core.GridConstraints(6, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator2 = new JToolBar.Separator();
        Calculator.add(toolBar$Separator2, new com.intellij.uiDesigner.core.GridConstraints(6, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a8Button = new JButton();
        a8Button.setText("8");
        Calculator.add(a8Button, new com.intellij.uiDesigner.core.GridConstraints(7, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a9Button = new JButton();
        a9Button.setText("9");
        Calculator.add(a9Button, new com.intellij.uiDesigner.core.GridConstraints(7, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a7Button = new JButton();
        a7Button.setText("7");
        Calculator.add(a7Button, new com.intellij.uiDesigner.core.GridConstraints(7, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button8 = new JButton();
        button8.setText("*");
        Calculator.add(button8, new com.intellij.uiDesigner.core.GridConstraints(7, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a6Button = new JButton();
        a6Button.setText("6");
        Calculator.add(a6Button, new com.intellij.uiDesigner.core.GridConstraints(8, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a5Button = new JButton();
        a5Button.setText("5");
        Calculator.add(a5Button, new com.intellij.uiDesigner.core.GridConstraints(8, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a4Button = new JButton();
        a4Button.setText("4");
        Calculator.add(a4Button, new com.intellij.uiDesigner.core.GridConstraints(8, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button12 = new JButton();
        button12.setText("-");
        Calculator.add(button12, new com.intellij.uiDesigner.core.GridConstraints(8, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a2Button = new JButton();
        a2Button.setText("2");
        Calculator.add(a2Button, new com.intellij.uiDesigner.core.GridConstraints(9, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 39), null, 0, false));
        a3Button = new JButton();
        a3Button.setText("3");
        Calculator.add(a3Button, new com.intellij.uiDesigner.core.GridConstraints(9, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 39), null, 0, false));
        button15 = new JButton();
        button15.setText("+");
        Calculator.add(button15, new com.intellij.uiDesigner.core.GridConstraints(9, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 39), null, 0, false));
        a1Button = new JButton();
        a1Button.setText("1");
        Calculator.add(a1Button, new com.intellij.uiDesigner.core.GridConstraints(9, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 39), null, 0, false));
        button17 = new JButton();
        button17.setText("%");
        Calculator.add(button17, new com.intellij.uiDesigner.core.GridConstraints(10, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a0Button = new JButton();
        a0Button.setText("0");
        Calculator.add(a0Button, new com.intellij.uiDesigner.core.GridConstraints(10, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button19 = new JButton();
        button19.setText(".");
        Calculator.add(button19, new com.intellij.uiDesigner.core.GridConstraints(10, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        button20 = new JButton();
        button20.setText("=");
        Calculator.add(button20, new com.intellij.uiDesigner.core.GridConstraints(10, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        tan_1Button = new JButton();
        tan_1Button.setText("tan_-1");
        Calculator.add(tan_1Button, new com.intellij.uiDesigner.core.GridConstraints(10, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        final JToolBar.Separator toolBar$Separator3 = new JToolBar.Separator();
        Calculator.add(toolBar$Separator3, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator4 = new JToolBar.Separator();
        Calculator.add(toolBar$Separator4, new com.intellij.uiDesigner.core.GridConstraints(5, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cos_1Button = new JButton();
        cos_1Button.setText("cos_-1");
        Calculator.add(cos_1Button, new com.intellij.uiDesigner.core.GridConstraints(9, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 39), null, 0, false));
        sin_1Button = new JButton();
        sin_1Button.setText("sin_-1");
        Calculator.add(sin_1Button, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        tanButton = new JButton();
        tanButton.setText("tan");
        Calculator.add(tanButton, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        cosButton = new JButton();
        cosButton.setText("cos");
        Calculator.add(cosButton, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        sinButton = new JButton();
        sinButton.setText("sin");
        Calculator.add(sinButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        cubertButton = new JButton();
        cubertButton.setText("cubert");
        Calculator.add(cubertButton, new com.intellij.uiDesigner.core.GridConstraints(5, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        sqrtButton = new JButton();
        sqrtButton.setText("sqrt");
        Calculator.add(sqrtButton, new com.intellij.uiDesigner.core.GridConstraints(5, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        cubeButton = new JButton();
        cubeButton.setText("cube");
        Calculator.add(cubeButton, new com.intellij.uiDesigner.core.GridConstraints(5, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        sqButton = new JButton();
        sqButton.setText("sq");
        Calculator.add(sqButton, new com.intellij.uiDesigner.core.GridConstraints(5, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        log_2Button = new JButton();
        log_2Button.setText("log_2");
        Calculator.add(log_2Button, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        lnButton = new JButton();
        lnButton.setActionCommand("ln    ");
        lnButton.setText("ln");
        Calculator.add(lnButton, new com.intellij.uiDesigner.core.GridConstraints(4, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        log_10Button = new JButton();
        log_10Button.setText("log_10");
        Calculator.add(log_10Button, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        a1XButton = new JButton();
        a1XButton.setText("1/X");
        Calculator.add(a1XButton, new com.intellij.uiDesigner.core.GridConstraints(4, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        radianRadioButton = new JRadioButton();
        radianRadioButton.setEnabled(true);
        radianRadioButton.setText("radian");
        Calculator.add(radianRadioButton, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(44, 44), null, 0, false));
        degreeRadioButton = new JRadioButton();
        degreeRadioButton.setEnabled(true);
        degreeRadioButton.setSelected(true);
        degreeRadioButton.setText("degree");
        Calculator.add(degreeRadioButton, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(44, 44), null, 0, false));
        log_xButton = new JButton();
        log_xButton.setText("log_x");
        Calculator.add(log_xButton, new com.intellij.uiDesigner.core.GridConstraints(4, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        x_r_yButton = new JButton();
        x_r_yButton.setText("x_r_y");
        Calculator.add(x_r_yButton, new com.intellij.uiDesigner.core.GridConstraints(3, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        xYButton = new JButton();
        xYButton.setText("x^y");
        Calculator.add(xYButton, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        piButton = new JButton();
        piButton.setText("pi");
        Calculator.add(piButton, new com.intellij.uiDesigner.core.GridConstraints(3, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        nButton = new JButton();
        nButton.setText("n!");
        Calculator.add(nButton, new com.intellij.uiDesigner.core.GridConstraints(3, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 39), null, 0, false));
        a10Button = new JButton();
        a10Button.setText("10^");
        Calculator.add(a10Button, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        Font textArea1Font = this.$$$getFont$$$(null, Font.BOLD | Font.ITALIC, 18, textArea1.getFont());
        if (textArea1Font != null) textArea1.setFont(textArea1Font);
        Calculator.add(textArea1, new com.intellij.uiDesigner.core.GridConstraints(1, 11, 9, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear");
        Calculator.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(10, 11, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator5 = new JToolBar.Separator();
        Calculator.add(toolBar$Separator5, new com.intellij.uiDesigner.core.GridConstraints(7, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        Calculator.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(6, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, 1, null, null, null, 0, false));
        ANSButton = new JButton();
        ANSButton.setText("ANS");
        Calculator.add(ANSButton, new com.intellij.uiDesigner.core.GridConstraints(2, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(70, 40), null, 0, false));
        textDisplay = new JTextField();
        textDisplay.setEditable(false);
        textDisplay.setText("");
        Calculator.add(textDisplay, new com.intellij.uiDesigner.core.GridConstraints(2, 7, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(10, 30), new Dimension(30, 4), null, 0, false));
        textDisplay1 = new JTextField();
        textDisplay1.setEditable(false);
        textDisplay1.setText("");
        Calculator.add(textDisplay1, new com.intellij.uiDesigner.core.GridConstraints(1, 7, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(10, 30), new Dimension(30, 4), null, 0, false));
        label = new JLabel();
        Font labelFont = this.$$$getFont$$$(null, Font.BOLD | Font.ITALIC, 18, label.getFont());
        if (labelFont != null) label.setFont(labelFont);
        label.setText("");
        Calculator.add(label, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.BOLD | Font.ITALIC, 20, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Note : Only we can perform operation on any two numbers at a time");
        Calculator.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 7, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radianRadioButton);
        buttonGroup.add(degreeRadioButton);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Calculator;
    }
}
