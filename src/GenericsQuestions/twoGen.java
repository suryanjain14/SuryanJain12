//Q.52
package GenericsQuestions;
import java.util.*;
public class twoGen<T,V>
{
    T ob1;
    V ob2;
    twoGen(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;
    }
    void show()
    {
        System.out.println("Type of T is:" + ob1.getClass().getName());
        System.out.println("Type of V is:" + ob2.getClass().getName());
    }

    T getOb1()
    {
        return ob1;
    }
    V getOb2()
    {
        return ob2;
    }
}
    class Simple
    {
        public static void main(String[] args) {
            twoGen<Integer,String> tob=new twoGen<Integer,String>(7,"Generic");
            tob.show();
            int v=tob.getOb1();
            System.out.println("value:"+v);
            String str=tob.getOb2();
            System.out.println("value:"+str);
        }
    }
