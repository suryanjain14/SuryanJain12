//Q.5
package CollectionQuestions;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> s = new HashMap<Integer, String>();

        s.put(1, "Virat kohli");
        s.put(2, "Rohit sharma");
        s.put(0, "Dhoni");
        s.put(3, "pant");

        for (Map.Entry a : s.entrySet()) {
            System.out.println(a.getKey() + "  " + a.getValue());
        }

    }


}

