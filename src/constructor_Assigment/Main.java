package constructor_Assigment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String user_input = null;
        do {

            System.out.println("Welcome to my Calculator");
            System.out.println("Please enter your values ");

            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            Calculator calculator = new Calculator(num1, num2);


            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Modulus");

            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Addition : " + calculator.addNumbers());
            } else if (input == 2) {
                System.out.println("Subtraction : " + calculator.substraction());
            } else if (input == 3) {
                System.out.println("Multiplication : " + calculator.multiplication());
            } else if (input == 4) {
                System.out.println("Division : " + calculator.division());
            } else if (input == 5) {
                System.out.println("Modulus : " + calculator.modulus());
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue? if yes type 'y' or 'Y' or type 'n' or 'N' to exit");
            user_input = scanner.next();
        } while (user_input != null && !user_input.equalsIgnoreCase("N"));

    }
}
