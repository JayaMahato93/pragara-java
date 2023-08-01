package string_Assignment;

public class Convert_String_Array {
    public static void main(String args[])
    {
        String str = "Pragra";

        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        for (char chr : chars) {
            System.out.println(chr);
        }
    }
}
