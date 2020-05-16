//Q.50
package GenericsQuestions;
import java.util.*;
public class Generics4 {
    public static void main(String[] args) {
            Examplee e=new Examplee();
            Thread t=new Thread(e);
            t.start();
      }
}
interface  javaGeneric
{
    void show1();
}
class Examplee implements Runnable {
    void show1()
    {
        System.out.println("Example class");
    }

    public void run() {
        show1();
        System.out.println("Welcome in Example class");
    }
}

