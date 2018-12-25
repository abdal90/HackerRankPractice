package src;//Objective
    //In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

//Task
    //Given an integer, , perform the following conditional actions:
    //If  is odd, print Weird
    //If  is even and in the inclusive range of  to , print Not Weird
    //If  is even and in the inclusive range of  to , print Weird
    //If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
    //Input Format

//A single line containing a positive integer, .
    //Constraints

//Output Format
    //Print Weird if the number is weird; otherwise, print Not Weird.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class ConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // If  is odd, print Weird
        int oddNumber = N % 2;

        if (oddNumber != 0){
            System.out.println("Weird");
        }

        // If  is even and in the inclusive range of 2 to 5, print Not Weird
        int evenNumber = N % 2;
        if ((evenNumber == 0) && (N >= 2) && (N <= 5)){
            System.out.println("Not Weird");
        }
        // If  is even and in the inclusive range of 6 to 20, print Weird
        if ((evenNumber == 0) && (N >= 6) && (N <= 20)){
            System.out.println("Weird");
        }

        // If  is even and greater than 20, print Not Weird
        if ((evenNumber == 0) && (N > 20)){
            System.out.println("Not Weird");
        }

        scanner.close();

    }
}
