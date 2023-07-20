package methode_Practice;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void evenoddnumbers(){
        int num;
        String user_input =null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        num = scanner.nextInt();

        do {

            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else if (num % 2 != 0) {
                System.out.println("Odd Number");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue? if yes type 'y' or 'Y' or type 'n' or 'N' to exit");
            user_input = scanner.next();
        }while (user_input!=null&& !user_input.equalsIgnoreCase("N"));
    }
}
