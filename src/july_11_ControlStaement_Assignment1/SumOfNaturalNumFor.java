package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class SumOfNaturalNumFor {
    public static void main(String[] args) {
        int num;
        int sum =0 ;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input number: ");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("The Sum of Natural Number upto "+ num + " terms : " +sum);
    }
}
