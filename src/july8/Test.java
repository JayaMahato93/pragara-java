package july8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =scanner.nextInt();
        if (num%2 == 0){
            System.out.println("Eeven");
        }else {
            System.out.println("Odd");
        }
    }
}
