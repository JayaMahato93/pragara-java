package august_26.Calculator_1;

public class Main {
    public static void main(String[] args) {
        Calcy calcy = (int a,int b) -> {
            int sum = a + b;
            return sum;

        };
        Calcy calcy1 =(int a,int b) -> {
            int div = a - b;
            return  div;
        };
        Calcy calcy2 = (int a,int b) ->{
            int multi = a*b;
            return  multi;
        };
        Calcy calcy3 = (int a,int b) ->{
            int divi = a/b;
            return  divi;
        };
        Calcy calcy4 =(int a,int b) ->{
            int modulus = a%b;
            return  modulus;
        };
        calcy1.Calcy(20,10);
        System.out.println("Adition"+ calcy );
    }
}
