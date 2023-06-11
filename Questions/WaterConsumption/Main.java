package Questions.WaterConsumption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int DOCTOR_ADVICE_TO_DRINK = 2000;
        Scanner inpScanner = new Scanner(System.in);
        var noOfTestCases = inpScanner.nextInt();
        while (noOfTestCases-- > 0) {
            int amountOfWaterDrank = inpScanner.nextInt();
            if(amountOfWaterDrank >= DOCTOR_ADVICE_TO_DRINK){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
