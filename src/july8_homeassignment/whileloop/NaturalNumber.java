package july8_homeassignment.whileloop;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {

        int counter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the counter: ");
        counter =scanner.nextInt();
        while (counter<=10) {
            System.out.println(counter );
            counter++;
        }
    }
}
