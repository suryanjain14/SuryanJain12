//Q.26
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        a.push("Manish");
        a.push("Yash");
        a.push("Suryan");
        System.out.println("Before removed Element:");
        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        a.pop();

        System.out.println("After removed Element:");
        Iterator itr1 = a.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }

}
