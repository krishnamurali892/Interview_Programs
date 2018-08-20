package linkedlist;

public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
        head = null;
    }

    // adding node at head
    public void addFirst(int data){
        Node newHead = new Node(data);;
        if(head == null){
            head = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
    }

    // adding node at tail
    public void addLast(int data){
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

    // printing list elements from head to tail
    public void printAll(){
        if(head != null){
            Node currentNode = head;
            while (currentNode!=null){
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }
    
     public void printAll(Node head){
        if(head != null){
            Node currentNode = head;
            while (currentNode!=null){
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public void remove (int data){

    }


    public void midOfLinkedList(){
        if(head != null){
            Node slowPtr = head;
            Node fastPtr = head;
            while (fastPtr!=null && fastPtr.next!=null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
            System.out.println("Mid element data: "+slowPtr.data);
        }
    }

    // print nth element from last in single iteration
    public void printNthFromLast(int n){
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr!=null){
            if(n > 0){
                fastPtr = fastPtr.next;
                n--;
            }else{
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
        }
        System.out.println(n+"th element from Last was: "+ slowPtr.data);
    }

    public void isLoopPresent(){
        if(head!=null){
            Node slowPtr = head;
            Node fastPtr = head;
            boolean isLoopPresent = false;
            while (fastPtr!=null && fastPtr.next!=null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if(fastPtr == slowPtr){
                    isLoopPresent = true;
                    break;
                }
            }
            if(isLoopPresent){
                System.out.println("Loop Present");
            }else{
                System.out.println("Loop not Present");
            }
        }
    }

    public void createLoop(){
        if(head!=null){
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = head;
        }
    }
    
    public void reverseLinkedList(){
       Node current = head;
       Node previous = null;
       Node next = null;

       while(current!=null){
           next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }
       if(previous!=null){
           printAll(previous);
       }
    }

}
