package august_22.collection.map;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        // key / value

        Map<String, String> map = new HashMap<>();
        map.put("name", "John");
        map.put("name", "Peter");


        map.putIfAbsent("password" , "password");

        map.putIfAbsent("password" , "2313131321");
        System.out.println(map.get("name"));

        System.out.println(map);


    }
}
