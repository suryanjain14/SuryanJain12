//Q.43
package GenericsQuestions;
import java.util.*;
class Generics3{
    public static void main(String[] args) {
       Example  g=new Example();
        g.show(5);
    }
}
interface  Manish<T>
{
    void  show(T t);

}
class Example implements Manish<Integer>
{
    public void show(Integer t)
    {
        System.out.println("Integer value is:" +t);
    }
}
