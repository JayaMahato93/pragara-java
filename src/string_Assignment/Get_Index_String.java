package string_Assignment;

public class Get_Index_String {
    public static void main(String[] args) {
        String str = "Pragra";
        System.out.println("String: "+str);
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        for (char chr : chars) {
            System.out.println(chr);
        }
        int index = str.indexOf( 'g' );
        System.out.println(" 'g' is at index of: "+"  "+ index);
    }
}
