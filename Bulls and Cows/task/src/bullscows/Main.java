package bullscows;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int round = 1;
        int n;
        int s;
        String input;
        String number;
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
            input = scanner.nextLine();
        try {
            n = validateInput(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + '"' + input + '"' + " isn't a valid number.");
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        input = scanner.nextLine();
        try {
            s = validateInput(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + '"' + input + '"' + " isn't a valid number.");
            return;
        }

        if (n <= s && s < 37 && n != 0) {
            System.out.println("Okay, let's start a game!");
            RandomNumbers random = new RandomNumbers();
            System.out.println("The secret is prepared: " + random.generateSecretCode(n, s) + ".");
            while (!result ) {
                System.out.println("Turn " + round + ":");

                number = scanner.next();
                result = random.guessNumber(number);

                if (result) {
                    System.out.println("Congratulations! You guessed the secret code.");
                } else {
                    round++;
                }
            }
        } else if (n > s) {
            System.out.println("Error: it's not possible to generate a code with a length of " +
                                n + " with " + s + " unique symbols.");

        } else {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
        }

    }
    public static int validateInput( String input) throws NumberFormatException{
            return Integer.parseInt(input);
    }
}

class RandomNumbers{
    private final String charSet;
    private String secretCode;

    public boolean guessNumber( String number) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < number.length(); i++) {
            if (secretCode.charAt(i) == number.charAt(i)) {
                bulls++;
            } else if (secretCode.contains(String.valueOf(number.charAt(i)))){
                cows++;
            }
        }
        String result = bulls != 0 ? (cows != 0 ? bulls + " bull(s) and " + cows + " cow(s)" :
                bulls + " bull(s)" ) :
                ( cows != 0 ? cows + " cow(s)" : "None");

        System.out.println("Grade: " + result + ".");

        return bulls == secretCode.length();
    }

    public RandomNumbers() {
        StringBuilder setBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            setBuilder.append(i);
        }
        for (int i = 97; i < 123; i++) {
            setBuilder.append((char) i);
        }
        charSet = setBuilder.toString();
        System.out.println(charSet);
    }

    public String generateSecretCode(int len, int sym) {
        StringBuilder code = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        int rand;
        while (code.length() < len) {
            rand = random.nextInt(sym);
            if (!code.toString().contains(String.valueOf(charSet.charAt(rand)))
                    && code.length() < len) {
                code.append(charSet.charAt(rand));
                result.append("*");
            }
        }
        secretCode = code.toString();
        if (sym < 10) {
            result.append("(0-9)");
        } else {
            result.append("(0-9, a-");
            result.append(charSet.charAt(sym - 1));
            result.append(").");
        }
        System.out.println("Code" + secretCode);
        return result.toString();
    }
}
