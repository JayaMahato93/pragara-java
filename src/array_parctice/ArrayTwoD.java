package array_parctice;

public class ArrayTwoD {
    public static void main(String[] args) {
        int array[][] =new int[5][5];
        for(int i = 0; i <5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print( array[i][j] +" " );
            }
            System.out.println();
        }
    }
}
