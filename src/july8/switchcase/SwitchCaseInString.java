package july8.switchcase;

import java.util.Scanner;

public class SwitchCaseInString {
    public static void main(String[] args) {

        System.out.println("Address of CN Tower");
        System.out.println("Address of Aquarium");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Place: ");
        String input = sc.nextLine();
        switch (input){
            case "CN Tower":
                System.out.println("290 Bremner Blvd, Toronto, ON M5V 3L9 " );
                break;
            case "Aquarium":
                System.out.println("288 Bremner Blvd, Toronto, ON M5V 3L9");
                break;
            default:
                System.err.println("Invalid");
        }
    }
}
