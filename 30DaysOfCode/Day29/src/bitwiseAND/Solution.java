package bitwiseAND;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            // We are given 2 numbers, n (the size of our set) and k (a constraint on the number we choose for our output)
            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            System.out.println( findMaximum(n, k) );
        }

        scanner.close();
    }

    public static int findMaximum(int n, int k){
        int max = 0;
        int a = n - 1; // we are constrained by a < b
        while(a-- > 0) {
            for(int b = a + 1; b <= n; b++){
                int result = a & b; // AND operator
                if(result < k  && result > max ){
                    max = result;
                }
            }
        }
        return max;
    }



}
