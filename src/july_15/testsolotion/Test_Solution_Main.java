package july_15.testsolotion;

import java.util.Scanner;

public class Test_Solution_Main {
    public static void main(String[] args) {
        String user_input = null;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome to Pragra");
            System.out.println("Press 1 for string");
            System.out.println("Press 2 for int");
            System.out.println("Press 3 for double");

            System.out.println("Enter your selection ");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter your Input");
                String name = scanner.next();
                TestSolution.enterInput(name);
            } else if (input == 2) {
                System.out.println("Enter your Input");
                int age = scanner.nextInt();
                TestSolution.enterInput(age);
            }else if (input == 3) {
                System.out.println("Enter your Input");
                double salary = scanner.nextDouble();
              TestSolution.enterInput(salary);
            }else{
                System.out.println("Invalid");
            }

                System.out.println("Do you want to continue? if yes type 'y' or 'Y' or type 'n' or 'N' to exit");
            user_input = scanner.next();
        } while (user_input != null && !user_input.equalsIgnoreCase("N"));

    }


}
