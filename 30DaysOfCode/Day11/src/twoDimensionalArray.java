package src;

import java.util.Random;
import java.util.Scanner;

public class twoDimensionalArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        // nested loop to form a matrix
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                // add numbers to matrix
               // arr[i][j] = scanner.nextInt();
                arr[i][j] = 1;
            }
        }
        int total;
        int maxTotal = -100;

        // space of traversal array is 4  0 - 3
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                total =
                                // first row
                                arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                //second row
                                + arr[i+1][j+1]
                                //thrid row
                                + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(total > maxTotal){
                    maxTotal = total;
                    //System.out.println(maxTotal);
                }
            }
        }
        System.out.println(maxTotal);
        scanner.close();
    }
}
