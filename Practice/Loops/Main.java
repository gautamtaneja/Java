package Practice.Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 1;
        while (a != count) {
            System.out.println(count);
            count++;

        }
    }
}