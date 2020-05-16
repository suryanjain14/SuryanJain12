package MultithreadingQuestions;
class NameMyThread
{
    public static void main (String [] args)
    {
        MyThread4 mt;
        if (args.length == 0)
            mt = new MyThread4 ();
        else
            mt = new MyThread4(args [0]);
        mt.start ();
    }
}
class MyThread4 extends Thread {
    MyThread4() {
        // The compiler creates the byte code equivalent of super ();
    }

    MyThread4(String name) {
        setName(name); // Pass name to Thread superclass
    }

    public void run() {
        System.out.println("My name is: " + getName());
    }
}