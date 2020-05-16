//Q.8
package CollectionQuestions;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeakhashMap2 {
    public static void main(String[] args) {
        Map<Number, String> a = new HashMap<>();
        a.put(1, "Adarsh");
        a.put(2, "Yash");
        a.put(3, "Suryan");
        Set set = a.entrySet();
        System.out.println(set);
        Set keySet = a.keySet();
        System.out.println("keyset is:" + keySet);

    }
}
