package july_11_Assignment;

import java.util.Scanner;

public class Alphabet_Check {
    public static void main(String[] args) {
        char charecter;
        System.out.print("Enter The Alphabet: ");
        Scanner scanner = new Scanner(System.in);
        charecter = scanner.next().charAt(0);

        if (Character.isAlphabetic(charecter) && (String.valueOf(charecter)).length() ==1 ) {
            System.out.println(charecter + " is an alphabet.");
            if(charecter == 'a' || charecter == 'e' || charecter == 'i' || charecter == 'o' || charecter == 'u' )
                System.out.println(charecter + " is vowel");
            else  {
                System.out.println(charecter + " is consonant");
            }
        }else{
            System.out.println(charecter + " is not an alphabet.");

        }


    }
}
