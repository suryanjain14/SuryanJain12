package CollectionQuestions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class map1 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(1, "dhoni");
        m.put(7, "Rahul");
        m.put(9, "ram");
        m.put(6, "pant");
        Set set = m.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

