package july25;

public class StringDemo {
    public static void main(String[] args) {
        String s1 ="Pragra";
        String s2 ="Pragra";
        String s3 = new String("Pragra");
        String s4 =new String("Pragra1");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }

}
