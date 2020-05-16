package DS;

class Queue extends LinkedList {
    private LinkedList l1 = new LinkedList();
    private LinkedList sp = null;

    public void push(int data) {
        sp = l1.add(data);

    }
    public void pop() {
        if (sp == null) {
            System.out.println("queue empty");
        } else {
            if (l1.head == sp) {
                System.out.println("deleting... " + l1.head.data);
                l1.head = null;
                sp = null;
            } else {
                l1.print();
                System.out.println("deleting... " + l1.head.data);
                l1.head = l1.head.next;
            }

        }
    }
    public void print(){
        l1.print();
    }
}

public class FIFO {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.pop();
        queue.push(12);
        queue.push(13);
        queue.push(14);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.push(17);
        queue.push(15);
        System.out.println("printing Queue");
        queue.print();
    }
}
