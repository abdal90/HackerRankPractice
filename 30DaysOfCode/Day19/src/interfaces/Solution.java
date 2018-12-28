package interfaces;

import java.util.Scanner;


class Calculator implements AdvancedArithmetic {
    // The implementation for the divisorSum(n) method must return the sum of all divisors of n
    public int divisorSum(int n) {
        // final result of divisor Sum
        int result = 0;

        // find all divisors of n
        // start at 1 because cannot divide by 0
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            // if 'i' is divisor of 'n'
            if (n % i == 0)
            {
                // if both divisors are same then
                // add it only once else add both
                if (i == (n / i))
                    result += i;
                else
                    result += (i + n / i);
            }
        }

        // Add 1 to the result as 1 is also a divisor
        return result;
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
