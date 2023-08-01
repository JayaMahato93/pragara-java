package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class NumbersCubeDoWhile {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        System.out.println("Enter the number of Terms: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        do {
            i++;
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
        }while (i<=num);
    }
}
