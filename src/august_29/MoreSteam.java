package august_29;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MoreSteam {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(12,4,343,5,4,54,5,4,65,6,5,6,5,65,2);
        nums.stream()
                .filter(x-> x%2 ==0)
                //.skip(2)
               // .limit(4)
                .sorted()
                .forEach(x-> System.out.println(x));
        System.out.println(nums);



       /* Set<Integer>collect = nums.stream()
                .filter(x-> x%2 ==0)
                .collect(Collectors.toSet());
        System.out.println(collect);

        */


    }
}
