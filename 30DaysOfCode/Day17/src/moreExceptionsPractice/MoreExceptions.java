package moreExceptionsPractice;

import java.util.concurrent.TimeUnit;

public class MoreExceptions {
    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp >= tooHot){
            throw new TooHotException();
        }else if (cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        double currentCocoaTemp = 190;
       boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.print("That cocoa was good");
                wrongTemp = false;
            } catch (TooHotException e) {
                System.out.println("TOO HOT");
                currentCocoaTemp = currentCocoaTemp - 5;
            } catch (TooColdException e1) {
                System.out.println("TOO COLD");
                currentCocoaTemp = currentCocoaTemp + 5;
            }
            TimeUnit.SECONDS.sleep(1);
        }

            System.out.print(" and its gone.");
            System.out.println();

    }
}

