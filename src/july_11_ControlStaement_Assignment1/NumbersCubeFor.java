package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class NumbersCubeFor {
    public static void main(String[] args) {

        int num = 0;
        System.out.println("Enter the number of Terms: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {

            System.out.println("Number is : " + i +" and cube of " + i +" is : "+(i*i*i));

        }

    }
}
