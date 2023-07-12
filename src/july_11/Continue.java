package july_11;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Area Sector");
        int sector;
        for (int i = 0; i <=10 ; i++) {
            sector =scanner.nextInt();
            if(sector == 13){
                continue;
            }
            System.out.println(sector);

        }
    }
}
