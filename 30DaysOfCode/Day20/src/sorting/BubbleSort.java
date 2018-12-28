package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Bubble Sort
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in ascending order
                if (a[j] > a[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");

        // print the array
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.println("First Element: " + a[0]);
            }
            if (i == a.length-1){
                System.out.println("Last Element: " + a[a.length - 1]);
            }

        }
    }
}
