//Q 6
package CollectionQuestions;
import java.util.HashMap;
import java.util.Map;
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> s = new HashMap<Integer, String>();

        print(s);
        s.put(1, "Virat kohli");
        s.put(2, "Rohit sharma");
        s.put(3, "Dhoni");
        s.put(0, "pant");

        System.out.println("Size of Map:" + s.size());

        print(s);
        if (s.containsKey("pant")) {
            String a = s.get("pant");
            System.out.println("value for key" + "\"\"pant\" is:" + a);
        }
        s.clear();
        print(s);

    }

    public static void print(Map<Integer, String> map) {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            System.out.println(map);

        }

    }

}



