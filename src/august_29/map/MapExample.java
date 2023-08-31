package august_29.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>productOf2 = num.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(productOf2);
    }
}
