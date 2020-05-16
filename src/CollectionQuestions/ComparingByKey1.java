//Q.17
package CollectionQuestions;
import java.util.HashMap;
import java.util.Map;
class ComparingByKey1 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Dhoni");
        map.put(101, "yuvraj");
        map.put(102, "Rahul");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}