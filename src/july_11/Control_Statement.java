package july_11;

import java.util.Scanner;

public class Control_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your limit");
        int limit = scanner.nextInt();
        int counter=0;
        do {
            System.out.println(counter);
            counter++;
        }while (counter<limit);

        }
    }

/*int counter=0;
        while(counter<10){
            System.out.println("Hello World");
            counter++;*/