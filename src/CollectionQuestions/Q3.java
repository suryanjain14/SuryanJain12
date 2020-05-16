//Q.3
package CollectionQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Adarsh");
        a1.add("Yagik");
        a1.add("abc");
        a1.add("def");
        System.out.println("Before the element delete: ");
        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("after the element delete:");
        Iterator itr1 = a1.iterator();
        itr1.next();
        itr1.remove();
        itr1.next();
        itr1.remove();
        itr1.next();
        itr1.remove();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());

        }

    }
}
