//Q7
package CollectionQuestion;
import java.util.Map;
import java.util.WeakHashMap;

class WeakHashMap1 {
    public static void main(String[] arg) {
        Map<Number, String> weak = new WeakHashMap<Number, String>();
        weak.put(1, "Game");
        weak.put(2, "is");
        weak.put(3, "Over");

        System.out.println("our weak map: " + weak);

        if (weak.containsValue("for"))
            System.out.println("for exist");

        if (weak.containsKey(1))
            System.out.println("1 exist");

        weak.clear();

        if (weak.isEmpty())
            System.out.println("empty map: " + weak);
    }
}