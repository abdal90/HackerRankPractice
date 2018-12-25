package src;// Task
    //Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

//Input Format
    //The first line contains an integer, N (the size of our array).
    //The second line contains N space-separated integers describing array A's elements.

//Output Format
    //Print the elements of array  in reverse order as a single line of space-separated numbers.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // set i = to end of array. then decrement from the end of the array
        for (int i = arr.length - 1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
