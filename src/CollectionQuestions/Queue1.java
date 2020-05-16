//Q.24
package CollectionQuestions;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            qu.add(i);
        }
        System.out.println("Queue Element:" + qu);
        Integer remo = qu.remove();
        System.out.println("removed Element:" + remo);
        Integer head = qu.peek();
        System.out.println("Head of queue:" + head);
        int size = qu.size();
        System.out.println("Size of queue-" + size);
    }


}