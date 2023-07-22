package july22;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        String vegitable[] =new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vegitable name:");
        for (int i = 0; i < vegitable.length; i++) {
            vegitable[i]=scanner.next();
        }
        for (String veg:vegitable) {
            System.out.println(veg);
        }
    }
}
