package MultithreadingQuestions;
class DaemonThreadDemo
    {
        public static void main (String [] args)
        {
            MyThread5 mt = new MyThread5 ();
            mt.setDaemon (true);
            mt.start ();
            try
            {
                Thread.sleep (100);
            }
            catch (InterruptedException e)
            {
            }
        }
    }
    class MyThread5 extends Thread
    {
        public void run ()
        {
            System.out.println ("Daemon is " + isDaemon ());
        }
    }
