//Q.2
import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Adarsh");
        a1.add("Yagik");
        a1.add("abc");
        a1.add("def");


        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}





