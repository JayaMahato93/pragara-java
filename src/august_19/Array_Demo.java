package august_19;

public class Array_Demo {

    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("print it");
        }
    }

}
