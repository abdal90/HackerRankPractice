package queue;

import java.util.LinkedList;
import java.util.Queue;

// First in First Out
public class Queuey {

    // Making a queue instance
    LinkedList queue;

    // constructor
    public Queuey() {
        queue = new LinkedList();
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
    public void enqueue(String n){
        queue.addLast(n);
    }

    // removing an item at the front
    public String dequeue(){
        return (String) queue.remove(0);
    }

    // peek at the first item
    public String peek(){
        return (String) queue.get(0);
    }

    public static void main(String[] args) {

        // Java inbuilt
        Queue<String> queue = new LinkedList<>();
        queue.add("Hi 2");
        queue.add("There 2");

        System.out.println(queue.remove());
        System.out.println(queue.remove());



        // own built
        Queuey queuey = new Queuey();
        queuey.enqueue("Hi");
        queuey.enqueue("There");
        System.out.println("First out: " + queuey.dequeue());
        System.out.println("Peek at second item: " + queuey.peek());
        System.out.println("Second out: " + queuey.dequeue());


    }
}
