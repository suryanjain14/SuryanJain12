//Q.29with remove Method

import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {

        TreeMap<Integer, String> tr = new TreeMap<>();
        tr.put(1, "Virat kohli");
        tr.put(2, "Pant");
        tr.put(3, "Dhoni");
        tr.put(4, "Rohit");
        System.out.println("Before remove Method:");
        for (Map.Entry a : tr.entrySet()) {
            System.out.println(a.getKey() + "  " + a.getValue());
        }
        tr.remove(1);
        System.out.println("after remove Method:");
        for (Map.Entry a : tr.entrySet()) {
            System.out.println(a.getKey() + "  " + a.getValue());
        }

    }

}

