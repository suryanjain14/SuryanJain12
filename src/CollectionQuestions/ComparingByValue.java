//Q.12
package CollectionQuestions;

import java.util.HashMap;
import java.util.Map;
class ComparingByValue {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Dhoni");
        map.put(101, "pant");
        map.put(102, "Rahul");
        map.entrySet()
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}  