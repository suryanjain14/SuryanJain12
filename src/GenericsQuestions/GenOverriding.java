//Q.49
package GenericsQuestions;

class Gen2<T>
{
    T ob;
    Gen2(T o)
    {
        ob=o;
    }
    T getob2()
    {
        System.out.println("Gen getob():");
        return ob;

    }
}

public class GenOverriding {
    public static void main(String[] args) {
        Gen2<Integer> iob1=new Gen2<>(66);
        Gen2<Integer> iob2=new Gen2<>(88);
        Gen2<String> iob3=new Gen2<String >("Allu Arjun");
        System.out.println(iob1.getob2());
        System.out.println(iob2.getob2());
        System.out.println(iob3.getob2());

    }
}
