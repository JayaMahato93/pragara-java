package string_Assignment;

public class Concatenated_String {
    public static void main(String[] args)
    {
        String str1 = "Pragra ";
        String str2 = "Java Class";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);

        System.out.println("The concatenated string: " + str3);
    }
}
