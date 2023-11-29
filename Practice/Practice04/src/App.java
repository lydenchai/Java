import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.err.println("Input the following score: \n-------------------------");
        System.out.println("Input English: ");
        Double english = scan.nextDouble();
        System.out.println("Input Math: ");
        Double math = scan.nextDouble();
        System.out.println("Input History: ");
        Double history = scan.nextDouble();
        System.out.println("Input Computer: ");
        Double computer = scan.nextDouble();
        System.out.println("Input Khmer: ");
        Double khmer = scan.nextDouble();

        System.out.println("Input Khmer: ");
        System.out.println("-------------------------");
        System.out.println("English     :" + english);
        System.out.println("\nMath      :" + math);
        System.out.println("\nHistory   :" + history);
        System.out.println("\nComputer  :" + computer);
        System.out.println("\nKhmer     :" + khmer);
        System.out.println("-------------------------\n");
        double total = english + math + history + computer + khmer;
        System.out.println("Total\t: " + total);
        double average = total / 5;
        System.out.println("Average:  " + average);
        System.out.println(average < 50 ? "He/She is poor"
                : (average >= 50 && average <= 65 ? "He/She is fair!"
                        : (average >= 65 && average <= 75 ? "He/She is fairly good!"
                                : (average >= 75 && average <= 85 ? "He/She is good"
                                        : (average >= 85 && average <= 95 ? "He/She is very good"
                                                : (average >= 95 ? "He/She is excellent" : "Invalid score"))))));
    }
}
