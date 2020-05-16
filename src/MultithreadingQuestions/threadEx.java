//q.62
package MultithreadingQuestions;
import java.util.*;
class subTh implements Runnable
{
    void get() {
        System.out.println("WelCome in threading");
    }
    public void run()
    {
        System.out.println("Hello world!");
    }
}
class ThreadEx {
    public static void main(String[] args) {
        subTh st=new subTh();
        Thread ThreadEx=new Thread(st);
        ThreadEx.start();
        st.get();
    }}


