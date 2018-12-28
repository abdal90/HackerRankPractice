package Scope;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    // A class constructor that takes an array of integers as a parameter and saves it to the  instance variable.
    public Difference(int[] elements) {
        this.elements = elements;
    }

    // A computeDifference method that finds the maximum absolute
    // difference between any 2 numbers in N and stores it in the maximum difference instance variable.

    public void computeDifference(){
    // To find the maximum difference, computeDifference
        // checks each element in the array
        Arrays.sort(elements);

        maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);

    }

}

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}