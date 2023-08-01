package july_11_ControlStaement_Assignment1;

import java.util.Scanner;

public class SumOfNaturalNumDoWhile {
    public static void main(String[] args) {
        int counter = 0;
        int num;
        int sum = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input number: ");
        num = scanner.nextInt();
        do {
            System.out.println(counter);
            sum =sum+ counter;
            System.out.println("The Sum of Natural Number upto "+counter+ " terms : " +sum);
            counter++;
        }while (counter <= num);


    }
}
