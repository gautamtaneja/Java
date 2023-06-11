package Questions.SavingTaxes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int earning = inpScanner.nextInt();
            int taxes = inpScanner.nextInt();
            System.out.println(earning - taxes);
        }
    }
}
