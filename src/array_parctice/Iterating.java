package array_parctice;

import java.util.Arrays;

public class Iterating {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int[] new_array = new int[10];
        System.out.println("Original Array : "+ Arrays.toString(array));

        for(int i=0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
    }

}
