package july25;

public class StringChar {
    public static void main(String[] args) {
        String s1 ="Pragra";
       char[]chars= s1.toCharArray();
        for (char ch:chars) {
            System.out.println(" "+ch);
        }
        System.out.println(s1.charAt(3));
    }
}
