package MultithreadingQuestions;
 class ThreadTest1 extends Thread
{
    public void run()
    {
        System.out.println("In run");
        yield();
        System.out.println("Leaving run");
    }
    public static void main(String []argv)
    {
        (new ThreadTest1()).start();
    }
}