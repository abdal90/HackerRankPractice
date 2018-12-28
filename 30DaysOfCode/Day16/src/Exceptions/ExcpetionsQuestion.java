package Exceptions;

import java.util.Scanner;

// Task
//Read a string, S , and print its integer value; if S cannot be converted to an integer, print Bad String.
public class ExcpetionsQuestion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Read a string, S
        String S = in.next();

        //print its integer value
        try{
            // convert String to int by parsing
            Integer value = Integer.parseInt(S);
            System.out.println(value);
        }
        catch (NumberFormatException e){

            //if S cannot be converted to an integer, print Bad String
            System.out.println("Bad String");
        }

    }

}
