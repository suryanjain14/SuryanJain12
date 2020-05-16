//Q.57
package GenericsQuestions;
public class GenCons {
    private double val;

    <T extends  Number>GenCons(T arg)
    {
        val=arg.doubleValue();
    }
    void show()
    {
        System.out.println("val:"+val);
    }

}
class  GenConsEx
{
    public static void main(String[] args) {
        GenCons test1=new GenCons(100);
        GenCons test2=new GenCons(123.5f);
        test1.show();
        test2.show();
    }
}
