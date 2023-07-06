package july4_home_assignment;

import java.util.Scanner;

public class LargestNumberHomeAssigment {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The Value of X : ");
        x = scanner.nextInt();
        System.out.println("Enter The Value of Y : ");
        y = scanner.nextInt();
        System.out.println("Enter The Value of Z : ");
        z = scanner.nextInt();
        if((x>y) && (x>z)){
            System.out.println("largest number: "+x);
        } else if ((x<y) && (y>z)) {
            System.out.println(" largest number: "+y);
        }
        else if (y<z && x<z){
            System.out.println("largest number: "+z);
        }
        else {
            System.out.println("Invalid");
        }
    }
}
