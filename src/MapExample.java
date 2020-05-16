import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(12, "yash");
        map.put(11, "vinay");
        map.put(13, "rahul");
        System.out.println(map.entrySet());
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
//            Map.Entry m= (Map.Entry) i.next();
            System.out.println(i.next());
//            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}