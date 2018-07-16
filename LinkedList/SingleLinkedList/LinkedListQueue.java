package linkedlist;

import java.util.Queue;

public class LinkedListQueue {
    private Node head;

    public LinkedListQueue(){
        head = null;
    }

    // add to last
    public void add(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    // remove from front
    public Object remove(){
        if(head != null){
            Node temp = head;
            head = head.next;
            return temp.data;
        }else{
            System.out.println("Queue is empty");
            return null;
        }
    }

}
