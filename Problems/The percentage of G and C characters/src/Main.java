
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double count = 0;
        Scanner scan = new Scanner(System.in);
        String genes = scan.nextLine().toLowerCase();
        char c;

        for (int i = 0; i < genes.length(); i++) {
            c = genes.charAt(i);
            count += c == 'c' || c == 'g' ? 1 : 0;
        }

        double res = (count / genes.length()) * 100;
        System.out.println(res);

    }
}