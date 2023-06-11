package Questions.Biryaniclasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int x = inpScanner.nextInt();
            int y = inpScanner.nextInt();
            System.out.println(x * y);
        }
    }
}
