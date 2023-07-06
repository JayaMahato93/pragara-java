package july4_home_assignment;

import java.util.Scanner;

public class EvenOddNumberHw {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        x = scanner.nextInt();
        if (x%2==0){
            System.out.println("Even Number");
        } else if (x%2!=0) {
            System.out.println("Odd Number");
        }else {
            System.out.println("Invalid");
        }
    }
}
