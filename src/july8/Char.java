package july8;

import java.util.Scanner;

public class Char {
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

        if (ch == '+') {
            System.out.print("Enter The Value of X: ");
            x = scanner.nextInt();
            System.out.print("Enter The Value of Y: ");
            y = scanner.nextInt();
            int sum= x+y;
            System.out.println("Addition: "+ sum);

        }else if (ch=='-') {
            System.out.print("Enter The Value of X: ");
            x = scanner.nextInt();
            System.out.print("Enter The Value of Y: ");
            y = scanner.nextInt();
            int div= x-y;
            System.out.println("Subtraction: "+ div);

        } else if (ch == '*') {
            System.out.print("Enter The Value of X: ");
            x = scanner.nextInt();
            System.out.print("Enter The Value of Y: ");
            y = scanner.nextInt();
            int multi= x*y;
            System.out.println("Multiplication: "+ multi);

        } else if (ch == '/') {
            System.out.print("Enter The Value of X: ");
            x = scanner.nextInt();
            System.out.print("Enter The Value of Y: ");
            y = scanner.nextInt();
            int div= x/y;
            System.out.println("Division: "+div);

        } else if (ch == '%') {
            System.out.print("Enter The Value of X: ");
            x = scanner.nextInt();
            System.out.print("Enter The Value of Y: ");
            y = scanner.nextInt();
            int modu= x%y;
            System.out.println("Modulus "+modu);

        }else {
            System.out.println("Invalid");
        }

    }
}


