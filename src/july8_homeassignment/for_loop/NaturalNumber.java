package july8_homeassignment.for_loop;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        int natural_num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  natural_num:");
        natural_num = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println( natural_num+i);
        }

    }
}
