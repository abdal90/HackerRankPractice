package BigO;

import java.util.HashMap;

public class RunTimePractice {

    // repetition function in linear time 0(n)

    public static int findNumberOfRepetitons(String s, char c){
        int sum = 0; // constant

        for (int i = 0; i < s.length(); i++) { // linear
            if (s.charAt(i) == c){ // linear
                sum++; // linear
            }
        }
        return sum; // constant
    }


    // quadratic time 0(n2)
    // check to see if string contains char
    public static int[] findNumsofRepitionv1(String s, char[] c){
        int[] sums = new int[c.length]; // constant - done only once

        // check String
        for (int i = 0; i < s.length(); i++) { // linear
            // check char
            for (int j = 0; j < c.length; j++) { // quadratic
                if (s.charAt(i) == c[j]){
                    sums[j] = sums[j] + 1;
                }
            }

        }
        return sums; // constant
    }

    //
    // check to see if string contains char
    public static int[] findNumsofRepitionv2(String s, char[] c){
        int[] sums = new int[c.length]; // constant - done only once

        // use hashmap to make it run linear time O(n + m)
        // takes up more space but faster
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))){
                // if character is not in the hash map then add it there
                hashMap.put(s.charAt(i), 1);
            }else{
                // if the key is contained already in the hash map
                int sum = hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i), sum+1);
            }
        }

        // get characters
        for (int i = 0; i < c.length; i++) {
            int sum;
            // if character is not inside hash map
            if (!hashMap.containsKey(c[i])){
                sums[i] = 0;
            }else {
                // get the value
                sums[i] = hashMap.get(c[i]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {
        // set a timer
        long startTIme = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitons("abca", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTIme;
        System.out.println("Test: " + duration + " ms");

        char[] a = {'a', 'b'};
        startTIme = System.currentTimeMillis();
        System.out.println(findNumsofRepitionv1("abcasdgfdgsrgaertsgsdfgdsfgstgshtgesgeg" +
                "sdfgsdfgsdfgsergsdfgsdfgsdg asfsadfasdfasfdljangoinawoefinalskjvnbjasbdfjanlfdjlas;fajbvoia", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTIme;
        System.out.println("Test: " + duration + " ms");

        startTIme = System.currentTimeMillis();
        System.out.println(findNumsofRepitionv2("abcasdgfdgsrgaertsgsdfgdsfgstgshtgesgeg" +
                "sdfgsdfgsdfgsergsdfgsdfgsdg asfsadfasdfasfdljangoinawoefinalskjvnbjasbdfjanlfdjlas;fajbvoia", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTIme;
        System.out.println("Test: " + duration + " ms");
    }
}
