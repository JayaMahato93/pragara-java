package array_Assignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
    {
        int num, max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        num = scanner.nextInt();
        int array[] = new int[num];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < num; i++)
        {
            array[i] = scanner.nextInt();
        }
        max = array[0];
        for(int i = 0; i < num; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
