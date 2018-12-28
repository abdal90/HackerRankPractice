package moreExceptions;

import java.util.Scanner;

public class moreExceptionQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

// Write a Calculator class with a single method: int power(int,int).
class Calculator{
    //The power method takes two integers, n and p, as parameters
    int power(int n, int p) throws Exception {
        // If either n or p is negative, then the method
        // must throw an exception with the message: n and p should be non-negative.
        if (n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        int result = (int) Math.pow(n,p);
        // returns the integer result of n^p
        return result;
    }
}

