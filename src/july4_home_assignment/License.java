package july4_home_assignment;

import java.util.Scanner;

public class License {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Age: ");
        age = scanner.nextInt();
        if (age >= 16 && age <18){
            System.out.println("Take learner exam");
        }else if (age >= 18) {
            System.out.println("Eligible to drive");
        }else if (age < 16){
            System.out.println("Can't Drive");
        }else {
            System.out.println("Invalid");
        }
    }

}
