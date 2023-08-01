package july_11_ControlStaement_Assignment1;

public class PragraDoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            i++;
            if(i %2 ==0) {
                System.out.println(i+"Pragra");
            }else {
                System.out.println(i);
            }

        }while (i <10  );
    }
}
