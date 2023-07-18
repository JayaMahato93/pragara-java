package july_15.methods;

import java.util.Scanner;

public class Calculator {
  public static  void calculator() {
       int num1 ;
        int num2;

      String user_input =null;

        Scanner scanner = new Scanner(System.in);
do{
        System.out.println("Welcome to my Calculator");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        System.out.println("Enter your values");
        int input = scanner.nextInt();

        if(input==1){
            System.out.print("Enter The Value of num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter The Value of num2: ");
            num2 = scanner.nextInt();
            int sum= num1+num2;
            System.out.println("Addition: "+ sum);
        } else if (input==2) {
            System.out.print("Enter The Value of num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter The Value of num2: ");
            num2 = scanner.nextInt();
            int sub = num1-num2;
            System.out.println("Subtraction: "+ sub);

        } else if (input == 3) {
            System.out.print("Enter The Value of num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter The Value of num2: ");
            num2 = scanner.nextInt();
            int multi= num1*num2;
            System.out.println("Multiplication: "+ multi);

        } else if (input==4) {
            System.out.print("Enter The Value of num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter The Value of num2: ");
            num2 = scanner.nextInt();
            int div= num1/num2;
            System.out.println("Division: "+div);

        } else if (input==5) {
            System.out.print("Enter The Value of num1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter The Value of num2: ");
            num2 = scanner.nextInt();
            int modu= num1%num2;
            System.out.println("Modulus "+modu);

        }else {
            System.out.println("Invalid");
        }
    System.out.println("Do you want to continue? if yes type 'y' or 'Y' or type 'n' or 'N' to exit");
    user_input = scanner.next();
}while (user_input!=null&& !user_input.equalsIgnoreCase("N"));


  }
}





