package august_26.inbuildLamdas;


import java.util.Locale;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        Consumer<String> consumer = (st) ->{
            System.out.println(st.trim());
            System.out.println(st.toUpperCase());
            System.out.println(st.length());

        };
        consumer.accept(" Pragra ");

        BiConsumer<Integer, Integer>biConsumer =(num1, num2)-> {System.out.println(num1+num2 );
            System.out.println(num1+"  "+num2);
        };
        biConsumer.accept(10,20);

        BiConsumer<Integer,String> biConsumer1 =(a, string) -> System.out.println(a+"  "+string);
        biConsumer1.accept(10, "Jaya");

        Predicate<Integer>predicate =(i)-> i%2 ==0;
        System.out.println(predicate.test(5));

        Supplier<String>supplier= ()->"Hello How Are You?";
        String s = supplier.get();
        System.out.println(s);


        Function<String,Integer>function = (st)->st.length();
        System.out.println(function.apply("Jaya"));


    }
}
