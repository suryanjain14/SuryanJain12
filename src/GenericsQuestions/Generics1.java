//Q.41
package GenericsQuestions;

public class Generics1<T> {
    private T t;
    public T get()
    {
        return t;
    }
    public void set(T t1)
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
