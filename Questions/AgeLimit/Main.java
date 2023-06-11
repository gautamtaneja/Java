package Questions.AgeLimit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int minAge = inpScanner.nextInt();
            int maxAge = inpScanner.nextInt();
            int age = inpScanner.nextInt();
            if(age >= minAge && age < maxAge ){
                System.out.println("YES");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
