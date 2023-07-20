package methode_Practice;

import java.util.Scanner;

public class Days_Of_The_Week {
    public static  void daysoftheweek() {
        int day;
        String user_input = null;

        Scanner scanner = new Scanner(System.in);



       do {
           System.out.print("Please enter a number to find a day : ");
           day = scanner.nextInt();
           if (day == 1) {
               System.out.println("Sunday");
           } else if (day == 2) {
               System.out.println("Monday");
           } else if (day == 3) {
               System.out.println("wednesday");
           } else if (day == 4) {
               System.out.println("Tuesday");
           } else if (day == 5) {
               System.out.println("Friday");
               ;
           } else if (day == 6) {
               System.out.println("Saturday");
           } else {
               System.out.println("Invalid");
           }
           System.out.println("Do you want to continue? if yes type 'y' or 'Y' or type 'n' or 'N' to exit");
           user_input = scanner.next();

       }while (user_input!=null&& !user_input.equalsIgnoreCase("N"));

    }
}
