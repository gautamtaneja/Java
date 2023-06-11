package Questions.Squats;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SQUATS_IN_SET = 15;
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int noOfSets = inpScanner.nextInt();
            System.out.println(noOfSets * SQUATS_IN_SET);
        }
    }
}
