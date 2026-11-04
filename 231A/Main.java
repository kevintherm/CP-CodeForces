import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        int passes = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                count += scan.nextInt();
            }

            if (count >= 2) {
                passes++;
            }
        }

        System.out.println(passes);
    }
}