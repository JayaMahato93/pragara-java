package july8_homeassignment.for_loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num*i);
        }

        }
    }

