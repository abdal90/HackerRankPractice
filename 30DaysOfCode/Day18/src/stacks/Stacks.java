package stacks;

import java.util.Stack;
// Last in First out
public class Stacks {
    public static void main(String[] args) {

        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");

        System.out.println(stacky.pop() + " ");
        System.out.println("peek: "+ stacky.peek());
        System.out.println(stacky.pop() + "! ");
        System.out.println("Size: " + stacky.size());


    }
}
