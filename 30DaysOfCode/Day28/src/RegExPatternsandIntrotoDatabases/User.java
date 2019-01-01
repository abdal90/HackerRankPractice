package RegExPatternsandIntrotoDatabases;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUsername, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUsername;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args) {

        Set a = new HashSet();
        a.add(1212);

        User Kath = new User("blonde", "hello world", 10, a);

        // regex

        // This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
        String myRegExString = "[a-zA-Z\\s]+";

        // This is the string we will check to see if our regex matches:
        String myString = "The quick brown fox jumped over the lazy dog...";

        // Create a Pattern object (compiled RegEx) and save it as 'p'
        Pattern p = Pattern.compile(myRegExString);

        // We need a Matcher to match our compiled RegEx to a String
        Matcher m = p.matcher(myString);

        // if our Matcher finds a match
        if( m.find() ) {
            // Print the match
            System.out.println( m.group() );
        }
        System.out.println("=======================================================");

        String string = "Hello, Goodbye, Farewell";
        Pattern pattern = Pattern.compile("\\p{Alpha}+");
        Matcher matcher = pattern.matcher(string);

        while( matcher.find() ){
            System.out.println(matcher.group());
        }

        System.out.println("=======================================================");

        // String Functions
        // If you know something about the structure of the strings you'll be working with you can use a split method
        // the code below splits two strings at a delimiter (a comma followed by a space)
        // and puts whatever falls between the delimiter into an array:

        String s1 = "Hello, Goodbye, Farewell";
        String s2 = "Hola, Adios, Hasta Luego";

        String myDelimiter = ", ";

        String[] s1array = s1.split(myDelimiter);
        String[] s2array = s2.split(myDelimiter);

        System.out.println("s1array[0]: " + s1array[0]);
        System.out.println("s1array[1]: " + s1array[1]);
        System.out.println("s1array[2]: " + s1array[2]);
        System.out.println("s2array[0]: " + s2array[0]);
        System.out.println("s2array[1]: " + s2array[1]);
        System.out.println("s2array[2]: " + s2array[2]);


    }
}
