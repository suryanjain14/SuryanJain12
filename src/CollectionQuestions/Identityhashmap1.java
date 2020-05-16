//Q.40
package CollectionQuestions;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
public class Identityhashmap1 {
    public static void main(String[] args) {
        Map h = new HashMap();
        Map hm = new IdentityHashMap();
        h.put("hkey", "hvalue");
        hm.put("hmkey", "hmvalue");
        System.out.println("Size of HashMap: " + h.size());
        System.out.println("Size of IdentityHashMap: " + hm.size());

    }
}
