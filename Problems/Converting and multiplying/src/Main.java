import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input;
        int converted;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        while (!"0".equals(input)) {
            try {
                converted = Integer.parseInt(input);
                System.out.println(converted * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }
            input = scanner.nextLine();
        }
    }
}