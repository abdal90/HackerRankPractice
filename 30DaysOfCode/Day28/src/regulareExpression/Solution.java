package regulareExpression;

// Consider a database table, Emails, which has the attributes First Name and Email ID
// Given N rows of data simulating the Emails table

// print an alphabetically-ordered list of people whose email address ends in @gmail.com

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // to store the names
        List<String> names = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            // regex to find gmail accounts
            String myRegExtString = "^.*@gmail.com$";

            Pattern pattern = Pattern.compile(myRegExtString);

            Matcher matcher = pattern.matcher(emailID);

            while (matcher.find()){
                names.add(firstName);
            }
        }

        // sort the names alphabetically
        Collections.sort(names);

        // get names and print each one
        for (String name: names) {
            System.out.println(name);
        }
        scanner.close();



    }

}
