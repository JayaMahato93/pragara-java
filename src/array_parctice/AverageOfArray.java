package array_parctice;

public class AverageOfArray {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int i = 0; i <array.length ; i++) {
            sum =sum+array[i];
            System.out.println("The Sum Is: "+ sum);
            double average = sum / array.length;
            System.out.println("Average value of the array elements is : " + average);
        }
    }
}
