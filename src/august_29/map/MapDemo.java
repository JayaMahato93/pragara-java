package august_29.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Mike","John", "Jane","Dan","Jennifer");
         List<String>product = names.stream()
               .map(name -> name.toUpperCase())
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
                 System.out.println(product);


       /* Stream<Integer> integerStream = names.stream().map(s -> s.length());


        System.out.println(integerStream);

        */
    }
}
