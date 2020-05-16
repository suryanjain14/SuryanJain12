//Q.42
package GenericsQuestions;

import java.util.*;

public class Generics2 {
    private Object t;
    public Object get()
    {
        return t;
    }
    public void set(Object t1)
    {
        this.t=t1;
    }

    public static void main(String[] args) {
        Generics1<String> a=new Generics1<>();
        a.set("manish");
        Generics1<Integer> a1=new Generics1<>();
        a1.set(10);
        System.out.println("a:"+a+"\na1:"+a1);
    }

}
