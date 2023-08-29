package august_26.lamda.calculate;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> {
            System.out.println("Sum:"+a+b);
            System.out.println("SUB:"+ (a-b));
            System.out.println("Mul:"+a*b);
            System.out.println("Div:"+a/b);
        };
        calculator.calculator(20,10);

    }
}
