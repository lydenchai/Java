import java.util.Scanner;

public class Homework01 {
  public static void main(String[] args) throws Exception {
    double[] sides = new double[2];
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input width: ");
    sides[0] = scanner.nextDouble();

    System.out.println("Input height: ");
    sides[1] = scanner.nextDouble();

    String message = "\nThe Result of the Rectangle : ";
    message += "\n---------------------";
    message += "\nwidth = " + sides[0] + ", height = " + sides[1];
    message += "\nRectangle's Area: " + String.format("%10.4f", sides[0] * sides[1]);
    message += "\nRectangle's Perimeter: " + String.format("%.2f", (sides[0] + sides[1]) * 2);

    System.out.println(message);
  }
}