package july4_home_assignment;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        x = scanner.nextInt();
        if(x==1){
            System.out.println("Sunday");
        } else if (x==2) {
            System.out.println("Monday");
        } else if (x==3) {
            System.out.println("wednesday");
        } else if (x==4) {
            System.out.println("Tuesday");
        } else if (x==5) {
            System.out.println("Friday"); ;
        } else if (x==6) {
            System.out.println("Saturday") ;
        }else{
            System.out.println("Invalid");
        }

    }
}
