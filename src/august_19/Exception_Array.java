package august_19;

import java.util.Arrays;
import java.util.Scanner;

public class Exception_Array {

    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Elements in the array are:: ");
        System.out.println(Arrays.toString(myArray));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the required element ::");
        try {
            int element = scanner.nextInt();
            System.out.println("Element in the given index is :: "+myArray[element]);
        } catch(ArrayIndexOutOfBoundsException e) {
            e.toString();

        }
        finally {
            scanner.close();
            System.out.println("The index you have entered is invalid");
        }


    }
}
