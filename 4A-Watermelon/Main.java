
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input <= 2 || input % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}