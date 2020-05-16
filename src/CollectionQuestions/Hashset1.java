//Q.15
package CollectionQuestions;
import java.util.HashSet;
public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Virat kohli");
        hs.add("Rohit sharma");
        hs.add("Rishabh pant");
        hs.add("Ms Dhoni");
        System.out.println(hs);
        System.out.println("List contains Ms Dhoni or not :" + hs.contains("Ms Dhoni"));
        hs.remove("Virat kohli");
        System.out.println(hs);


    }
}
