package src.linkedListPractice;

import java.util.LinkedList;

public class LinkedListPractice {

    // properties
    Node head; // reference to the first node
    int count; // to know how many nodes we have in linked list

    // constructor
    public LinkedListPractice(Node newHead){
        head = newHead;
        count = 1;
    }

    // Methods
    // add to list
    public void add(int newData){
        // create a new node
        Node temp = new Node(newData);
        // find where end Node is
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext(); // 0 -> 1 -> 2
        }
        // set current as newNode
        current.setNext(temp);
        // increment
        count++;
    }

    // get list
    public int get(int index){
        // get index of node
        // if we don't have any value in the node return null
        if (index <= 0){
            return -1;
        }
        Node current = head;
        // go through list until we get to the index
        for (int i = 1; i < index; i++) {
            current = current.getNext(); // start at first node
        }

        return  current.getData();
    }

    // size of list
    public int size(){
        return count;
    }
    // is empty
    public boolean isEmpty(){
        return head == null;
    }
    // remove
    public void remove(){
        // remove from the back of the linked list
        Node current = head;
        // go to the end of the list (might cause a bug if only two nodes)
        while (current.getNext().getNext() != null){
            current = current.getNext(); // 0 -> 1 -> 2
        }
        // remove pointer to the end of the list
        current.setNext(null);
        // remove the count
        count--;

    }


    public static void main(String[] args) {
        // java version built in linkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }
}
