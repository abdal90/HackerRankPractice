package src.linkedListPractice;
// need node class for linked list
// holds data
public class Node {
    // singly linked list properties
    // referecnec
    Node next;
    // data type
    int data;

    // constructor 1
    public Node(int newData){
        data = newData;
        next = null;
    }

    // constructor 2
    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }

    // getters and setters

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
