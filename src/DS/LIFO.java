package DS;
class Stack extends LinkedList{
   private LinkedList l1=new LinkedList();
    private LinkedList sp=null;

    public void push(int data){
        sp=l1.add(data);

    }

    public void  pop(){
        if(sp==null){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(sp.data);
            l1.del();
            sp=sp.prev;
        }

    }

    public void print(){
        l1.print();
    }
}
public class LIFO {
    public static void main(String[] args) {

        Stack stack= new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(17);
        stack.push(15);
        stack.print();






    }
}
