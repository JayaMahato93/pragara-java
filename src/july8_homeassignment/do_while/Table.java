package july8_homeassignment.do_while;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int input;
        int counter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input:");
        input = scanner.nextInt();
        System.out.println("Enter the counter: ");
        counter =scanner.nextInt();
        do {
            System.out.println(input*counter);
            counter ++;
        } while (counter <= 10);
    }
}
