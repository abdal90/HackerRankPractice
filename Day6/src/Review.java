import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        // number of entries
        int T = scanner.nextInt();
        // scanner to remove nextInt
        scanner.nextLine();

        for (int i = 1; i <= T; i++) {
            String string = scanner.nextLine();
            for (int j = 0; j < string.length(); j++) {
                //even numbers
               if (j%2 == 0) {
                    System.out.print(string.charAt(j));
                }

            }
            // space in between
            System.out.print(" ");
            for (int j = 0; j < string.length(); j++) {
                //odd numbers
                if (j%2 == 1) {
                    System.out.print(string.charAt(j));
                }

            }
            System.out.println();
        }

    }
}
