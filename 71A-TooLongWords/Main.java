
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        int loop = scan.nextInt();
        for (int i = 0; i < loop; i++) {
            var word = scan.next();

            if (word.length() <= 10) {
                System.out.println(word);
                continue;
            }

            int len = word.length();
            System.out.println(word.substring(0, 1) + (len - 2) + word.substring(len - 1, len));
        }
    }
}