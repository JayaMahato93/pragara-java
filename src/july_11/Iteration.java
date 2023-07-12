package july_11;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The num");
        int num;
        for (int i = 0; i <=10 ; i++) {
            num =scanner.nextInt();
            if(num<0){
                break;
            }
            System.out.println("sorry you violated the policy");

        }
    }
}
