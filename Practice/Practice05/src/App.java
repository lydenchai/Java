import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n;
            do {
                System.out.print("Input n : ");
                n = scanner.nextInt();
                if (n >= 1 && n <= 10) {
                    int sum = 0;
                    System.out.println("-------------------");
                    for (int i = 1; i <= n; i++) {
                        sum += i;
                        System.out.print(i);
                        if (i < n) {
                            System.out.print(" + ");
                        }
                    }
                    System.out.println(" = " + sum);
                }
            } while (n < 1 || n > 10);
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
