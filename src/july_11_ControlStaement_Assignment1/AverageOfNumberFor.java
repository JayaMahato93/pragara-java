package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class AverageOfNumberFor {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        double avg;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter"+(i+1)+ "Num: ");
            num = scanner.nextInt();
            sum =sum + num;
        }
        avg = sum/5;
        System.out.println("The sum of 5 no is : " + sum +"\nThe Average is : " +avg);

    }
}
