package july8.switchcase;

import java.util.Scanner;

public class SwitchCaseChar {
    public static void main(String[] args) {
        int x;
        int y;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        System.out.println("Enter your values");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.print("Enter The Value of X: ");
                x = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                y = scanner.nextInt();
                int sum = x + y;
                System.out.println("Addition: " + sum);
            break;
            case'-':
                System.out.print("Enter The Value of X: ");
                x = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                y = scanner.nextInt();
                int div = x - y;
                System.out.println("Subtraction: " + div);
                break;
            case '*':
                System.out.print("Enter The Value of X: ");
                x = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                y = scanner.nextInt();
                int multi = x * y;
                System.out.println("Multiplication: " + multi);
            break;
            case '/':
                System.out.print("Enter The Value of X: ");
                x = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                y = scanner.nextInt();
                int division = x / y;
                System.out.println("Division: " + division);

            break;

            case '%':
                System.out.print("Enter The Value of X: ");
                x = scanner.nextInt();
                System.out.print("Enter The Value of Y: ");
                y = scanner.nextInt();
                int modulus = x % y;
                System.out.println("Modulus " + modulus);
            break;
            default:
                System.out.println("Invalid");

        }

    }
}
