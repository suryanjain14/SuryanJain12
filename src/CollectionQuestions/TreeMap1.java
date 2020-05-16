//Q.28 without remove Method

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> tr = new TreeMap<>();
        tr.put(1, "Virat kohli");
        tr.put(2, "Pant");
        tr.put(3, "Dhoni");
        tr.put(4, "Rohit");

        for (Map.Entry a : tr.entrySet()) {
            System.out.println(a.getKey() + "  " + a.getValue());
        }
    }
}
