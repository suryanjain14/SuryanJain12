//Q4 wap of HashMap
package CollectionQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        HashMap<Integer, String> s = new HashMap<Integer, String>();

        s.put(2, "Adarsh");
        s.put(3, "Yagik");
        s.put(0, "abc");
        s.put(1, "def");

        for (Map.Entry a : s.entrySet()) {
            System.out.println(a.getKey() + "  " + a.getValue());
        }

    }


}

