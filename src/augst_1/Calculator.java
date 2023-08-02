package augst_1;

import java.util.Scanner;

class CalculatorTest{
    private  double num1;
    private  double num2;
    CalculatorTest(){
        System.out.println("This is the default value for calculator ");
    }

    public CalculatorTest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double addNumbers(){

        return this.num1+this.num2;
    }

    public double substraction(){

        return this.num1-this.num2;
    }

    public double multiplication(){

        return this.num1*this.num2;
    }

    public double division(){

        return this.num1/this.num2;
    }

    public double modulus(){

        return this.num1%this.num2;
    }
    public double getNum1() {

        return num1;
    }

    public void setNum1(double num1) {

        this.num1 = num1;
    }

    public double getNum2() {

        return num2;
    }

    public void setNum2(double num2) {

        this.num2 = num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_input = null;
        do {

            System.out.println("Welcome to my Calculator");
            System.out.println("Please enter your values ");

            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            constructor_Assigment.Calculator calculator = new constructor_Assigment.Calculator(num1, num2);


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
