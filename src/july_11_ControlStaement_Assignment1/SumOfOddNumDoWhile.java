package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class SumOfOddNumDoWhile {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        int sum =0;
        System.out.println("Enter the number of Terms: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        do {
            i++;
            System.out.println (2*i-1);
            sum = sum+2*i-1;
        }while (i<num);
        System.out.println ("The Sum of odd Natural Number upto " + num +" terms is: " +sum);
    }
}
