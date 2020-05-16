//Q.37
package CollectionQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIterator1 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("VIRAT");
        a.add("ROHIT");
        a.add("PANT");
        ListIterator<String> itr = a.listIterator();
        System.out.println("Traversing Element in forward direction");
        while (itr.hasNext()) {
            System.out.println("index:" + itr.nextIndex() + "\tvalue:" + itr.next());

        }
        System.out.println("Traversing Element in backward direction  ");
        while (itr.hasPrevious()) {
            System.out.println("index:" + itr.previousIndex() + "\tvalue:" + itr.previous());

        }
    }
}
