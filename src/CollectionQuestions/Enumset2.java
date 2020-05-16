//Q.21
package CollectionQuestions;

import java.util.EnumSet;
import java.util.Set;


public class Enumset2 {
    enum Days {FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY}

    public static void main(String[] args) {
        Set<Days> s = EnumSet.allOf(Days.class);
        System.out.println("Week days:" + s);
        Set<Days> s1 = EnumSet.noneOf(Days.class);
        System.out.println("Week days:" + s1);
    }

}
