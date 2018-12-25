package src;

import java.util.Scanner;

public class BinaryNumbers {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        // change base 10 to base 2
        char[] binary = Integer.toBinaryString(n).toCharArray();

        // counter to keep track of consecutive 1's
        int tempCounter = 0;
        int maxCounter = 0;

        // loop through binary and print number
        for (int i = 0; i < binary.length; i++) {
            //System.out.println(binary[i]);
            if (binary[i] == '0'){
                tempCounter = 0;
            }else {
                tempCounter = tempCounter + 1;
            }

            // if temp counter is greater than max counter i.e consectuive 1's
            if (tempCounter > maxCounter){
                maxCounter = tempCounter;
            }

        }

        System.out.println(maxCounter);


    }
}
