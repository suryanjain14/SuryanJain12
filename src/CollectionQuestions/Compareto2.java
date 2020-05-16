//Q.11
package CollectionQuestions;
import java.util.*;
public class Compareto2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "HELLO";

        int var1 = s1.compareToIgnoreCase(s2);
        int var2 = s1.compareTo(s2);
        System.out.println(" s1 compareToIgnore s2: " + var1 + "\n s1 compareto s2 :" + var2);
        int var3 = s2.compareToIgnoreCase(s3);
        int var4 = s2.compareTo(s3);
        System.out.println(" s2 compareToIgnore s3: " + var3 + "\n s2 compareto s3 :" + var4);
    }
}
