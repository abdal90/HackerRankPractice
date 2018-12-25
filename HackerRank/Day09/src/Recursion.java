import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recursion {
    // Complete the factorial function below.
    static int factorial(int n) {
        if (n < 0){
            throw new RuntimeException("Constraint cannot be less than 2");
        }
        else if (n >= 20){
            throw new RuntimeException("Cannot be larger than 20");
        }
        else if (n == 0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        //bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        System.out.println(result);

        scanner.close();
    }
}
