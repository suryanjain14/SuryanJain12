//Q.18
package CollectionQuestions;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
class ComparingByKey2 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Dhoni");
        map.put(101, "yuvraj");
        map.put(102, "Rahul");
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}  