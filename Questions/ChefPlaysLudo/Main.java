package Questions.ChefPlaysLudo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int NEW_TOKEN_NUMBBER = 6;
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int x = inpScanner.nextInt();
            if (x == NEW_TOKEN_NUMBBER) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
