//Q.34
package CollectionQuestions;
import java.util.LinkedHashSet;
public class Linkedhashset2 {
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("Yash");
        a.add("Suryan");
        a.add("Manish");
        System.out.println("linkedhashset size" + a.size());
        System.out.println("Original Linkedhashset:" + a);
        System.out.println("Removing Nish from Linkedhashset: " + a.remove("Nish"));
        System.out.println("update Linkedhashset" + a);
    }
}
