package july8.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for White bulb");
        System.out.println("Press 2 for Red bulb");
        System.out.println("Press 3 for Fan");
        System.out.println("Press 4 for Nothing");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Switch on the white bulb ");
                break;
            case 2:
                System.out.println("Switch on the Red bulb");
                break;
            case 3:
                System.out.println("Switch on the Fan");
                break;
            case 4:
                    System.out.println("Switch on the white nothing");
                    break;
            default:
                System.out.println("Wrong input");

        }
    }
}
