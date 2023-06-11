package Questions.GoodTurn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x + y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
