import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] array) {
        int[] arr = new int[2];
        arr[0] = array[0];
        arr[1] = array[array.length - 1 ];
        return arr;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}