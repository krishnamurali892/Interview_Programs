package linkedlist;

public class LinkedListStack {
    private Node head;

    public LinkedListStack(){
        head = null;
    }

    public void push(int data){
        Node currentNode = new Node(data);
        if(head == null){
            head = currentNode;
        }else{
            currentNode.next = head;
            head = currentNode;
        }
    }

    public Object pop(){
        if(head != null){
            Node temp = head;
            head = head.next;
            return temp.data;
        }else{
            System.out.println("Stack is empty");
            return null;
        }
    }

    public Object peek(){
        if(head != null){
            return head.data;
        }else{
            System.out.println("Stack is empty");
            return null;
        }
    }

    public boolean isEmpty(){
        return head == null? true: false;
    }
}
