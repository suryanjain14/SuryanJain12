package DS;


class LinkedList {
    LinkedList head;
    int data;
    LinkedList next;
    LinkedList prev;

    LinkedList() {
    }

    LinkedList(int value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }

    public LinkedList add(int value) {
        if (this.head == null) {
            LinkedList n = new LinkedList(value);
            head = n;
            return n;

        } else {
            LinkedList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            LinkedList n = new LinkedList(value);
            n.prev = temp;
            temp.next = n;

            return n;
        }
    }

    public void print() {
        if (head == null)
            System.out.println("Linked list is empty");
        else {
            LinkedList temp = this.head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void del(){
        if (this.head == null)
            System.out.println("Linked list is empty");
        else if(this.head.next==null){
            System.out.println("deleting... "+this.head.data);
            this.head=null;
        }
        else {
            LinkedList temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            };
            System.out.println("deleting... "+temp.data);
            temp.prev.next=null;

        }
    }

}
public class List {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.del();
        ll1.print();
    }
}
