package ScopePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderPractice {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DATE, 0);
        System.out.println(calendar.getTime());

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formated = format1.format(calendar.getTime());
        System.out.println(formated);
    }
}
