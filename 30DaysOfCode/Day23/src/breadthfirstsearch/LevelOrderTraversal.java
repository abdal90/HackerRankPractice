package breadthfirstsearch;

// A level-order traversal, also known as a breadth-first search
// visits each level of a tree's nodes from left to right, top to bottom

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class LevelOrderTraversal {
    // Complete the levelOrder function provided in your editor
    // so that it prints the level-order traversal of the binary search tree
    static void levelOrder(Node root){
        // You'll find a queue helpful in completing this challenge
        Queue<Node> queue = new LinkedList<>();
        // add the root to the queue
        if (root != null){
            queue.add(root);
        }

        // loop through the entire search
        while (!queue.isEmpty()){
            // remove first root at the front of the container
            Node tree = queue.poll();
            // print out the root
            System.out.print(tree.data + " ");

            // check the left side of the tree first
            if (tree.left != null){
                // add to the queue
                queue.add(tree.left);
            }
            // check the right side of the tree
            if (tree.right != null){
                queue.add(tree.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
