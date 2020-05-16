//Q.25
package CollectionQuestions;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
        sm.put(107, "Dhoni");
        sm.put(102, "Rohit Sharma");
        sm.put(106, "Virat");
        System.out.println("HeadMap:" + sm.headMap(107));
        System.out.println("tailMap:" + sm.tailMap(107));
        System.out.println("subMap" + sm.subMap(102, 107));


    }
}
