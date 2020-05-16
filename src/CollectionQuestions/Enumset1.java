//Q.20
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

public class Enumset1 {
    public static void main(String[] args) {
        Set<Days> s = EnumSet.of(Days.MONDAY, Days.SATURDAY);
        Iterator<Days> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
