//Q.48
package GenericsQuestions;
import java.util.*;
class  NonGen
{
    int num;
    NonGen(int i)
    {
        num=i;
    }
    int getnum()
    {
     return num;
    }
}
class Gen<T> extends NonGen
{
    T ob;
    Gen(T o,int i)
    {
        super(i);
        ob=o;
    }
    T getob()
    {
        return ob;
    }
}
public class GenExample {
    public static void main(String[] args) {
        Gen<String> w= new Gen<>("hello",4);
        System.out.println(w.getob()+"");
        System.out.println(w.getnum());
    }
}
