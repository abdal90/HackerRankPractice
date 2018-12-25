package src;// Task
    //Given an integer, n, print its first  multiples.
    // Each multiple nxi (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.

//Input Format
    //A single integer, n.

import java.util.Scanner;

//Constraints
    // 2 <= n <= 20
//Output Format
    //Print 10 lines of output; each line i (where 1 <= i <= 10) contains the  of  in the form:
    // n x i = result.
public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
