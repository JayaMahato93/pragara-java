package july4_home_assignment;

import java.util.Scanner;

public class PositiveNumberHW {
    public static void main(String[] args) {
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        x = scanner.nextDouble();
        if(x>=0){
            System.out.println("Number is Positive");
        } else if (x<0) {
            System.out.println("Number is Nagetive");
        }else {
            System.out.println("Invalid");
        }
    }
}
