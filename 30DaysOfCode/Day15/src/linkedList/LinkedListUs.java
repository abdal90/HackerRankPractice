package src.linkedList;


import java.util.Scanner;

public class LinkedListUs {

    public static  Node insert(Node head,int data) {
        //Complete this method
        // if there is no head
        if (head == null){
            // insert a new node
            return new Node(data);
        }
        // if we have a head
        // add new node
        Node newNode = new Node(data);
        // set current node to head
        Node current = head;
        // while current.next is not null, get next element until we reach the end of the list
        while (current.next != null){
            // get the next node
            current = current.next;
        }
        // if we have reached the end of list and the next element is null
        // set new node to current
        current.next = newNode;
        // return head of the node
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
            System.out.println("head: " + head.data);
        }
        display(head);
        sc.close();
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

