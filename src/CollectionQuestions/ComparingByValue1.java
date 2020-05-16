//Q.13
package CollectionQuestions;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
class ComparingBYValue1 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Dhoni");
        map.put(101, "Jadeja");
        map.put(102, "Rahul");
        map.entrySet()
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
