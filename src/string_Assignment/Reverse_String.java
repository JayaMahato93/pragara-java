package string_Assignment;

public class Reverse_String {
    public static void main(String[] args)
    {

        String s1 = "pragra";
        System.out.println(s1);
        char[] charArray = s1.toCharArray();
        for (char n:charArray) {
            System.out.println(" "+n);

        }
        for (int i = charArray.length-1; i >=0 ; i--) {
            System.out.println(" ");
            System.out.println(" "+charArray[i]);
        }

    }

}
