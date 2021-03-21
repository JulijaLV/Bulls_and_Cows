import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double result = 1.0 / 4.0 * Math.sqrt(4 * Math.pow(a, 2) * Math.pow(b, 2)
                                                - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2));
        System.out.println(result);
    }
}