package july_11_Assignment;

import java.util.Scanner;

public class SumOfOddNumFor {
    public static void main(String[] args) {
        int num = 0;
        int sum =0;
        System.out.println("Enter the number of Terms: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 1; i <num ; i++) {
            System.out.println (2*i-1);
            sum = sum+2*i-1;
        }
        System.out.println ("The Sum of odd Natural Number upto " + num +" terms is: " +sum);
    }
    }

