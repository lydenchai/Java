import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double width, height;
        String w, h;
        w = JOptionPane.showInputDialog("Input width: ");
        width = Double.parseDouble(w);
        h = JOptionPane.showInputDialog("Input height: ");
        height = Double.parseDouble(h);
        String message = "Rectangle Width: " + width;
        message += "\nRectangle Height: " + height;
        message += "\n ---------------------------";
        message += "\n";
        message += "\n1. Rectangle Perimeter: " + (width + height) * 2;
        message += "\n2. Rectangle Area: " + (width * height);
        JOptionPane.showMessageDialog(null, message);
    }
}