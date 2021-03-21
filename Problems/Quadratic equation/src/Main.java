import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double x1 = 0;
//        double x2 = 0;
//        double dscr = Math.pow(b, 2) - 4 * a * c;
//
//        if (dscr > 0) {
//            x1 = (-b + Math.sqrt(dscr)) / (2 * a);
//            x2 = (-b - Math.sqrt(dscr)) / (2 * a);
//        } else if (dscr == 0) {
//            x1 = -(b / 2 * a);
//        }
//
//        System.out.println(Math.min(x1, x2) == x1 ? x1 + " " + x2 : x2 + " " + x1);
        Random generator = new Random();
        int a = generator.nextInt(3);
        int b = generator.nextInt(2) + 1;
        int c = generator.nextInt(4);
        System.out.println(a + " " + b + " " + c);
    }
}