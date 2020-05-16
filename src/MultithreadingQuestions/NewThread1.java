package MultithreadingQuestions;
public class NewThread1 implements Runnable {
    public static void main(String[] args) {
        Thread NewThread1 = new Thread("Allu");
        Thread NewThread2 = new Thread("Arjun");
        NewThread1.start();
        NewThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(NewThread1.getName());
        System.out.println(NewThread2.getName());
    }

    public void run() {
    }
}