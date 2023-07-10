package july8;

import java.util.Scanner;

public class TernaryOprator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =scanner.nextInt();
      String  result = (num %2 ==0) ? "even ": "odd";
        System.out.println(result);
    }
}
