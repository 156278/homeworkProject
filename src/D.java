import com.sun.xml.internal.ws.server.provider.AsyncProviderInvokerTube;

import java.util.Scanner;

public class D {
    public static void convTime() {
        System.out.println("Please input a time with the following format hh:mm:ssPM/hh:mm:ssAM: ");
        Scanner scin5 = new Scanner(System.in);
        String timeStr = scin5.next(), timeH, timeM, timeS, timeAoP;
        timeH = timeStr.substring(0, 2);
        timeM = timeStr.substring(3, 5);
        timeS = timeStr.substring(6, 8);
        timeAoP = timeStr.substring(8, 10);
        if (timeAoP.equals("PM")) {
            timeH = (Integer.valueOf(timeH) != 12) ? String.valueOf(Integer.valueOf(timeH) + 12) : timeH;
        } else {
            timeH = (Integer.valueOf(timeH) != 12) ? timeH : "00";

        }
        System.out.println("Reformated, your time now looks like this:\n" + timeH + ":" + timeM + ":" + timeS + " Uhr");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FreshScreen.freshScreen();
    }
}
