package july8;

import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");

        System.out.println("Enter your values");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.print("Enter The Value of X: ");
                num1 = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("Addition: " + sum);
            break;
            case 2:
                System.out.print("Enter The Value of X: ");
                num1 = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                num2 = scanner.nextInt();
                int div = num1 - num2;
                System.out.println("Subtraction: " + div);

             break;
            case 3:
                System.out.print("Enter The Value of X: ");
                num1 = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                num2 = scanner.nextInt();
                int multi = num1 * num2;
                System.out.println("Multiplication: " + multi);

            break;
            case 4:
                System.out.print("Enter The Value of X: ");
                num1 = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                num2 = scanner.nextInt();
                int division= num1 / num2;
                System.out.println("Division: " + division);

             break;
            case 5:
                System.out.print("Enter The Value of X: ");
                num1 = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                num2 = scanner.nextInt();
                int modu = num1 % num2;
                System.out.println("Modulus " + modu);

            break;
            default:
                System.out.println("Invalid");

        }
    }
}


