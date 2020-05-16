//Q.22
package CollectionQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class q {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Virat");
        dq.add("Ms dhoni");
        dq.add("Rohit");
        dq.add("pant");
        for (String str : dq) {
            System.out.println(str);
        }
    }
}
