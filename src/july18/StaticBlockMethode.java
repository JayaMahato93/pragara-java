package july18;

public class StaticBlockMethode {
    static {
        System.out.println("Print fist...");
    }
    public static void main(String[] args) {
        System.out.println("Inside main mehod... ");
    }
    static {
        System.out.println("Print 2...");
    }
}
