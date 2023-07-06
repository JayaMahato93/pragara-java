package july4_home_assignment;

import java.util.Scanner;

public class LeapYearHW {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year : ");
        year = scanner.nextInt();
        if (year%4==0){
            System.out.println("Leap Year");
        } else if (year%4!=0) {
            System.out.println("Not A leap Year");
        }else {
            System.out.println("Invalid");
        }
    }
}
