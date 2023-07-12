package july_11;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
            do {
                System.out.print("Enter first num: ");
                int first_num = scanner.nextInt();
                System.out.print("Enter Second num: ");
                int second_num = scanner.nextInt();
                System.out.print("Enter third num: ");
                int third_num = scanner.nextInt();
                if ((first_num > second_num) && (first_num > third_num)) {
                    System.out.println("largest number: " + first_num);
                } else if ((first_num < second_num) && (second_num > third_num)) {
                    System.out.println(" largest number: " + second_num);
                } else if (second_num < third_num && first_num < third_num) {
                    System.out.println("largest number: " + third_num);
                } else if ((first_num == second_num) && (second_num == third_num)) {
                    System.out.println("Equal num");
                } else {
                    System.out.println("Invalid");
                }
                System.out.println("Are you ready to exit?\n press Y for Yes\n N for no ");
                input = scanner.next();
                if(input.equals("Y")){
                    System.out.println("Exit");
                }else{
                    System.out.println("Continue");
                }

            } while (input==null ||  input.equalsIgnoreCase("N") );

    }
}
