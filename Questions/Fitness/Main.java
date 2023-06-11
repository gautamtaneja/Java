package Questions.Fitness;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int OFFICE_OPEN_DAYS = 5;
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int x = inpScanner.nextInt();
            System.out.println(x * OFFICE_OPEN_DAYS);
        }
    }
}
