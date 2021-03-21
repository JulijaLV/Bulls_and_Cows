import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date1 = scan.nextLine();
        String[] date2 = date1.split("-");
        System.out.println(date2[1] + "/" + date2[2] + "/" + date2[0]);
    }
}