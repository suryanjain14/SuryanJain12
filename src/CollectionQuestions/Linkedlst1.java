//Q.36
package CollectionQuestions;

import java.util.LinkedList;
public class Linkedlst1 {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("kartik");
        lst.add("aaryan");
        lst.add("allu");
        lst.add("arjun");

        System.out.println(lst);
        System.out.println("remove() :" + lst.remove(0));

        System.out.println(lst);
        System.out.println("remove():" + lst.remove("aaryan"));

        System.out.println(lst);
        System.out.println("remove() :" + lst.remove(1));

        System.out.println(lst);
        System.out.println("remove() :" + lst.remove("arjun"));

    }


}


