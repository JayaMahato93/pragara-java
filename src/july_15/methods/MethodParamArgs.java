package july_15.methods;

import java.util.Scanner;

public class MethodParamArgs {
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 num: ");
        int num1 = sc.nextInt();
        System.out.print
                ("Enter 2 num: ");
        int  num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.print("Sum of 2 num: "+sum);

    }
}
