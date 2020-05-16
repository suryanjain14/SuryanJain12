//q.61
package MultithreadingQuestions;
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try{
            System.out.println("Thread:"+Thread.currentThread().getId()+"\tis running");
            }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
public class Mthread1 {
    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i <= 5; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }
    }
}
