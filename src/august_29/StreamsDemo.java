package august_29;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,23,25);
        list.stream().filter(x -> 10<x && x>20).forEach(x -> System.out.println(x));

    }
}

