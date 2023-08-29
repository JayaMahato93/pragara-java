package august_22.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkLIst {
        public static void main(String[] args) {


            List<Integer> list = new LinkedList<>();
            System.out.println("Enter the list of 6 numbers ");
            list.add(10);
            list.add(20);
            list.add(20);
            list.add(40);
            list.add(50);
            list.add(60);

            list.remove(0);
            System.out.println(list);


            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }





        }
}
