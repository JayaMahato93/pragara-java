package array_parctice;

public class Find_Index {
    public static int  findIndex (int array[], int t) {
        if (array == null)
            return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == t)
                return i;
            else i = i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 5));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 1));
    }
}
