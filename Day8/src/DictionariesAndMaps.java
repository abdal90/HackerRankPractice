// Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
// You will then be given an unknown number of names to query your phone book for.
// For each names queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
// if an entry for names is not found, print Not found instead.

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class DictionariesAndMaps {
<<<<<<< HEAD
=======

>>>>>>> 272dc8133afe6bc40ff9eddf6ac9af8ae77cb97c
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

<<<<<<< HEAD
        // create map
        Map<String, Integer> phoneBook = new HashMap<>();

        // loop through scanner
=======
        Map<String, Integer> phoneBook = new HashMap<>();

>>>>>>> 272dc8133afe6bc40ff9eddf6ac9af8ae77cb97c
        for (int i = 0; i < n; i++) {
            // add name
            String name = in.next();
            // add phone number
            int phone = in.nextInt();
<<<<<<< HEAD
            // add name and phone to hashMap
=======
            // Write code here
>>>>>>> 272dc8133afe6bc40ff9eddf6ac9af8ae77cb97c
            phoneBook.put(name, phone);
        }


        while (in.hasNext()) {
            String s = in.next();
<<<<<<< HEAD
            // if entry in phone book is not null print out
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                // if nothing is there print our
                System.out.println("Not found");
            }
=======
            // Write code here
                if (phoneBook.get(s) != null) {
                    System.out.println(s + "=" + phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
>>>>>>> 272dc8133afe6bc40ff9eddf6ac9af8ae77cb97c
        }
        in.close();
    }
}
