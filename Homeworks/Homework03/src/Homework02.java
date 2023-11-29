import javax.swing.JOptionPane;

public class Homework02 {
  public static void main(String[] args) throws Exception {
    double[] exchangeRate = new double[2];
    String khmer = JOptionPane.showInputDialog("Input Khmer money: ");
    exchangeRate[0] = Double.parseDouble(khmer);
    String dollar = JOptionPane.showInputDialog("Input USA rate: ");
    exchangeRate[1] = Double.parseDouble(dollar);

    String message = "Khmer Money: " + exchangeRate[0] + ", USA Rate: " + exchangeRate[1];
    message += "\nTotal Dollars: " + exchangeRate[0] / exchangeRate[1];
    JOptionPane.showMessageDialog(null, message);
  }
}
