package august_22.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();


        queue.offer(12);
        queue.offer(32);
        queue.offer(42);
        queue.offer(52);

        System.out.println(queue);


        queue.poll();
        System.out.println(queue);


        System.out.println(queue.peek());


}
}
