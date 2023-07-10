package july8.switchcase;

import java.util.Scanner;

public class SwitchCostumerCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Hindi");
        System.out.println("Press 3 for French");
        System.out.println("Press 4 for Invalid");

        System.out.println("Enter your values");
        int input = scanner.nextInt();
        switch (input){
            case 1 :
                System.out.println("English");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("French");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
