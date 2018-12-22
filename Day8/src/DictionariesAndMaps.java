// Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
// You will then be given an unknown number of names to query your phone book for.
// For each names queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
// if an entry for names is not found, print Not found instead.

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class DictionariesAndMaps {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // add name
            String name = in.next();
            // add phone number
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }


        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            Integer phoneNumber = phoneBook.get(s);
                if (phoneNumber != null) {
                    System.out.println(s + "=" + phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
        }
        in.close();
    }
}
