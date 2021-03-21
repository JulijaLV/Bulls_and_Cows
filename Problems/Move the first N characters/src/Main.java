import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] split = line.split(" ");
        int num = Integer.parseInt(split[1]);
        if (num > split[0].length()) {
            System.out.println(split[0]);
        } else {
            char[] chars = split[0].toCharArray();

            System.out.println(String.copyValueOf(chars, num, line.length() - num - 2) +
                               String.copyValueOf(chars, 0, num));
        }
    }
}