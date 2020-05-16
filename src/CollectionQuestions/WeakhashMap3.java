//Q.9
package CollectionQuestions;
import java.util.HashMap;
import java.util.Map;

public class WeakhashMap3 {
    public static void main(String[] args) {
        Map<Number, String> a = new HashMap<>();
        a.put(1, "Adarsh");
        a.put(2, "Gourav");
        a.put(3, "manish");
        Map<Number, String> a1 = new HashMap<>();

        a1.putAll(a);
        System.out.println(a1.get(2));
        System.out.println("Size of map is:" + a1.size());
        a1.remove(2);
        System.out.println("Size of map is:" + a1.size());

    }
}
