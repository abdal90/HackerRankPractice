package nestedLogic;

import java.text.ParseException;
import java.util.Scanner;

class BookReturnDate{
    public int day;
    public int month;
    public int year;

    public BookReturnDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Solution {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

       BookReturnDate actual = new BookReturnDate(scanner.nextInt(), scanner.nextInt(),scanner.nextInt());

        //System.out.println("actual returned date: " + actual.day + actual.month + actual.year);

       BookReturnDate expected = new BookReturnDate(scanner.nextInt(), scanner.nextInt(),scanner.nextInt());

        //System.out.println("expected return date: " + expected.day + expected.month + expected.year);

       scanner.close();

       // set fine to zero
        int fine = 0;

        // Year logic
        // if turned in the same year
        if (expected.year == actual.year){
            //Month Logic
            // if the book was returned a month late
            if (expected.month < actual.month){

                fine = 500 * (actual.month - expected.month);

            }else{
                // Day logic
                if (expected.day < actual.day){
                    fine = 15 * (actual.day - expected.day);
                }
            }

        }else if (expected.year < actual.year){
            // returned a year later
            fine = 10000;
        }

        System.out.println(fine);

    }

}
