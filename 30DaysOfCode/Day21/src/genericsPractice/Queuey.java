package genericsPractice;

import java.util.LinkedList;
import java.util.Queue;

// First in First Out
public class Queuey<D> {

    // Making a queue instance
    private LinkedList<D> queue;

    // constructor
    public Queuey() {
        queue = new LinkedList<>();
    }

    // is queue empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // what is the size
    public int size(){
        return queue.size();
    }

    // add to the back of the linked list
    public void enqueue(D n){
        queue.addLast(n);
    }

    // removing an item at the front
    public D dequeue(){
        return queue.remove(0);
    }

    // peek at the first item
    public D peek(){
        return queue.get(0);
    }

    public static void main(String[] args) {

        // own built
        Queuey<String> queuey = new Queuey<>();
        queuey.enqueue("Hi");
        queuey.enqueue("There");
        System.out.println("First out: " + queuey.dequeue());
        System.out.println("Peek at second item: " + queuey.peek());
        System.out.println("Second out: " + queuey.dequeue());


    }
}
