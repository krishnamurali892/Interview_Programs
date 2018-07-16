package linkedlist;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {
            MyLinkedList ll = new MyLinkedList();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.printAll();
//            ll.midOfLinkedList();
//            ll.printNthFromLast(4);
            ll.createLoop();
            ll.isLoopPresent();

//            LinkedListStack llStack = new LinkedListStack();
//            llStack.push(1);
//            llStack.push(2);
//            llStack.push(3);
//            llStack.push(4);
//            llStack.pop();
//            llStack.pop();
//            llStack.pop();
//            if(!llStack.isEmpty()){
//                llStack.pop();
//            }
//            if(!llStack.isEmpty()){
//                llStack.pop();
//            }
//            llStack.pop();

//        LinkedListQueue llQueue = new LinkedListQueue();
//        llQueue.add(1);
//        llQueue.add(2);
//        llQueue.add(3);
//        llQueue.add(4);
//        llQueue.remove();
//        llQueue.remove();
//        llQueue.remove();
//        llQueue.remove();
//        llQueue.remove();
    }
}
