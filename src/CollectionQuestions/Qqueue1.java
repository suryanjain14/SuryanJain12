//Q.23
package CollectionQuestions;
import java.util.Iterator;
import java.util.PriorityQueue;

class Pqueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Manish");
        q.add("Yash");
        q.add("Suryan");
        System.out.println("head" + q.peek());
        System.out.println("head:" + q.element());
        System.out.println("iterating the queue Element");
        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("after removing two Element");
        q.remove();
        q.poll();
        Iterator itr1 = q.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}