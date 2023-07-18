package july_15.moremethod;

import java.util.Scanner;

public class MoreMethodeMain {
    public static void main(String[] args) {
        String user_input = null;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome to my Calculator");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Multiplication");
            System.out.println("Enter your values");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter 1 num: ");
                int num1 = scanner.nextInt();

                System.out.println("Enter 2 num: ");
                int num2 = scanner.nextInt();

                System.out.println("Enter 3 num: ");
                int num3 = scanner.nextInt();
                int adition = MoreMethod_Addition_Multiplication.calculation(num1, num2, num3);
                System.out.println("Adition: " + adition);
            } else if (input == 2) {
                System.out.println("Enter 1 num: ");
                int num1 = scanner.nextInt();

                System.out.println("Enter 2 num: ");
                int num2 = scanner.nextInt();

                System.out.println("Enter 3 num: ");
                int num3 = scanner.nextInt();

                System.out.println("Enter 4 num: ");
                int num4 = scanner.nextInt();

                int multiplication = MoreMethod_Addition_Multiplication.calculation(num1, num2, num3, num4);
                System.out.println("Multiplication: " + multiplication);

            }else{
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue? if yes type 'y' or 'Y' or type 'n' or 'N' to exit");
            user_input = scanner.next();
        } while (user_input != null && !user_input.equalsIgnoreCase("N"));


    }
}


//Calculator.calculator();
       /* System.out.println("Sum of 2 num : "+MoreMethods.sum(10, 20));
        int total = MoreMethods.sum(10, 20, 30);
        System.out.println("Sum of 3 num : "+total);
        */