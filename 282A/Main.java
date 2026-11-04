
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        int X = 0;

        for (int i = 0; i < n; i++) {
            String stmt = scan.nextLine();
            int incCount = 0;
            int decCount = 0;
            for (int j = 0; j < stmt.length(); j++) {
                

                if (stmt.charAt(j) == 'X') {
                    continue;
                }

                if (stmt.charAt(j) == '+') {
                    incCount++;
                    if (incCount == 2) {
                        X++;
                        incCount = 0;
                    }
                } else if (stmt.charAt(j) == '-') {
                    decCount++;
                    if (decCount == 2) {
                        X--;
                        decCount = 0;
                    }
                }
            }
        }

        System.out.println(X);
    }
}