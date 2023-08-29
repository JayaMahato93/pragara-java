package august_22.collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List <Integer> list = new java.util.ArrayList<>();
        System.out.println("Enter 5 number");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        list.remove(0);
        System.out.println(list);

        /*for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i));
        }*/

        /*for (Integer element : list) {
            System.out.println(element);
        }*/



        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
