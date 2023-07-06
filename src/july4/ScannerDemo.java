package july4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {


        int x;
        int y;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of X :");
        x = scanner.nextInt();
        System.out.print("Enter the value of Y :");
        y = scanner.nextInt();
        sum =x+y;
        System.out.println("Sum of X and Y :"+sum );

    }


}
