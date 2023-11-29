import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double number1, number2;
        String string1 = JOptionPane.showInputDialog("Input number 1: ");
        number1 = Double.parseDouble(string1);
        String string2 = JOptionPane.showInputDialog("Input number 2: ");
        number2 = Double.parseDouble(string2);
        String message = "Result of the Operations:";
        message += "\nnumber1 = " + number1 + ", " + "number2 = " + number2;
        message += "\n==========================";
        message += "\nAddition: " + (number1 + number2);
        message += "\nSubtraction: " + (number1 - number2);
        message += "\nMultiplication: " + (number1 * number2);
        message += "\nDivision: " + String.format("%.2f", number1 / number2);
        JOptionPane.showMessageDialog(null, message);
    }
}
