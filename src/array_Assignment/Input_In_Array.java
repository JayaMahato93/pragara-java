package array_Assignment;

import java.util.Scanner;

public class Input_In_Array {
    public static void main(String[] args)
    {
        int num ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        num=scanner.nextInt();

        int array[]= new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<num; i++)
        {

            array[i]=scanner.nextInt();
        }
        System.out.println("Array elements are: ");

        for (int i=0; i<num; i++)
        {
            System.out.println(array[i]);
        }
    }
}
