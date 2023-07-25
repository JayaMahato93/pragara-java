package array_parctice;

import java.util.Arrays;

public class Removing_Element {
    public static void main(String[] args) {
        int array[] = {1,2,2,3,4,5,6,7,8,9};

        System.out.println("Original Array : "+ Arrays.toString(array));

        int removeIndex = 1;

        for(int i = removeIndex; i < array.length -1; i++){
           array[i] = array[i + 1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(array));
    }
}
