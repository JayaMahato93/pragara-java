package array_Assignment;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args)
    {
        int num, j=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        num = scanner.nextInt();
        int array[] = new int[num];
        int rev[] = new int[num];
        System.out.println("Enter  elements: ");
        for( int i=0; i < num; i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for( int i=num; i>0 ; i--, j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);

        }
    }
}
