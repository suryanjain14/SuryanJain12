//Q.35
package CollectionQuestions;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Linkedlst {
    public static void main(String[] args) {
        List<String> lst = new LinkedList<String>();
        lst.add("kartik");
        lst.add("aaryan");
        lst.add("allu");
        lst.add("arjun");

        Iterator itr = lst.iterator();
        Object First = itr.next();
        Object Second = itr.next();
        Object third = itr.next();
        Object fourth = itr.next();
        System.out.println("First:"+First+"Second:"+Second+"third"+third+"fourth"+fourth);
}

  
}

