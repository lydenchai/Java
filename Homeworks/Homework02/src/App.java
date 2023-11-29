import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum, difference, product, and quotient of the two numbers.
            int sum = num1 + num2;
            int subtract = num1 - num2;
            int multiply = num1 * num2;
            int divide = num1 / num2;

            // Print the results to the console.
            System.out.println("Calculation of two numbers (int): num1 = " + num1 + ", num2 = " + num2);
            System.out.println("num1 + num2 = " + sum);
            System.out.println("num1 - num2 = " + subtract);
            System.out.println("num1 * num2 = " + multiply);
            System.out.println("num1 / num2 = " + divide);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
