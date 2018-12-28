package queuesAndStacksQuestion;

// A palindrome is a word, phrase, number,
// or other sequence of characters which reads the same backwards and forwards


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    // Two instance variables: one for your stack, and one for your queue.
    Stack<Character> stack = new Stack<>();

    Queue<Character> queue = new LinkedList<>();

    // A void pushCharacter(char ch) method that pushes a character onto a stack.
    public void pushCharacter(char ch){
        //FILO
        stack.add(ch);
    }

    // A void enqueueCharacter(char ch) method that enqueues a character in the queue instance variable.
    public void enqueueCharacter(char ch){
        // FIFO
        queue.add(ch);
    }

    // A char popCharacter() method that pops and returns the character at the top of the stack instance variable.
    public char popCharacter(){
        return stack.pop();
    }

    //A char dequeueCharacter() method that dequeues and returns the first character in the queue instance variable
    public char dequeueCharacter(){
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Palindrome p = new Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
