//Q.56
package GenericsQuestions;
class Test
{
    static <T> void genericDisplay (T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }
    public static void main(String[] args)
    {
        genericDisplay(11);
        genericDisplay("datflair");
        genericDisplay(1.0);
    }
}
