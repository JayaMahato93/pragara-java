package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class AverageOfNumberWhile {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int i = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);

        while (i<5){
            System.out.println("Enter"+(i+1)+ "Num: ");
            num = scanner.nextInt();
            sum =sum + num;
            i++;
        }
        avg = sum/5;
        System.out.println("The sum of 5 no is : " + sum +"\nThe Average is : " +avg);


    }
}
