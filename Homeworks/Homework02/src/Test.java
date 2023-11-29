import java.util.Scanner;

public class Test {
  public static void main(String[] args) throws Exception {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the first number: ");
      int num1 = scanner.nextInt();
      System.out.println("Enter the second number: ");
      int num2 = scanner.nextInt();

      int sum = Sum(num1, num2);
      int subtract = Subtract(num1, num2);
      int multiply = Multiply(num1, num2);
      int divide = Divide(num1, num2);

      printResults(num1, num2, sum, subtract, multiply, divide);

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static int Sum(int num1, int num2) {
    return num1 + num2;
  }

  private static int Subtract(int num1, int num2) {
    return num1 - num2;
  }

  private static int Multiply(int num1, int num2) {
    return num1 * num2;
  }

  private static int Divide(int num1, int num2) {
    return num1 / num2;
  }

  private static void printResults(int num1, int num2, int sum, int subtract, int multiply, int divide) {
    System.out.println("Calculation of two numbers (int): num1 = " + num1 + ", num2 = " + num2);
    System.out.println("num1 + num2 = " + sum);
    System.out.println("num1 - num2 = " + subtract);
    System.out.println("num1 * num2 = " + multiply);
    System.out.println("num1 / num2 = " + divide);
  }
}
