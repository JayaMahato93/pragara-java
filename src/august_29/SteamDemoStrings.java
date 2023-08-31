package august_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemoStrings {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("Peter", "Mike","John", "Jane","Dan","Jennifer",
                "Peter", "Mike","John", "Jane","Dan","Jennifer");
        List<String>namewithj = names.stream()
                .filter(name -> name
                        .startsWith("J"))
                .filter(n->n.length()>4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(namewithj);
    }
}
