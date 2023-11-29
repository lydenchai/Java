public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(5 / 3); // output 1
        // System.out.println(5 % 3); // output 2

        int n = 5, m;
        System.out.println(n);
        m = n--;
        System.out.println("N:" + n);
        System.out.println("M:" + m);

        int a = 5, b;
        b = ++a;
        System.out.println("A:" + a);
        System.out.println("B:" + b);
    }
}
