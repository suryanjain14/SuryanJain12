//Q.74
package MultithreadingQuestions;
public class MultiThreadtwoThreads1 {
    public static void main(String[] args) {

    }
}

class ThreadDemo4 implements Runnable {
    Thread t;

    ThreadDemo4() {
        t = new Thread(this, "MyThread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Child Thread: " + t.currentThread() + " " + i);
                t.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

}