import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double num1, num2;
        String num1Input, num2Input;
        num1Input = JOptionPane.showInputDialog("Input number 1:");
        num1 = Double.parseDouble(num1Input);
        num2Input = JOptionPane.showInputDialog("Input number 2:");
        num2 = Double.parseDouble(num2Input);
        String operator = JOptionPane.showInputDialog("Input operator:");

        double result = 0.0;
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Division by zero");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Invalid operator");
        }
        JOptionPane.showMessageDialog(null, num1Input + " " + operator + " " + num2Input + " = " + result);
    }
}
