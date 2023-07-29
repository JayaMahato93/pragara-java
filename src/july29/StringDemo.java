package july29;

public class StringDemo {
    public static void main(String[] args) {
        String s = "prara";
        String sNew  =new String("toronto");
        System.out.println(s);
        System.out.println(sNew);


        StringBuilder sb =new StringBuilder("Pragra");
        sb.append("Toronto");
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer("Microsoft");
        stringBuffer.append("Toronto");
        System.out.println(stringBuffer);

    }
}
