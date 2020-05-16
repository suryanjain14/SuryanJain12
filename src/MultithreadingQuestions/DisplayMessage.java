package MultithreadingQuestions;
import java.util.*;
class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {

            DisplayMessage a=new DisplayMessage("hello");
            Thread t=new Thread();
            t.start();
            }
    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}