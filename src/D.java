import com.sun.xml.internal.ws.server.provider.AsyncProviderInvokerTube;

import java.util.Scanner;

public class D {
    public static void convTime() {
        System.out.println("Please input a time with the following format hh:mm:ssPM/hh:mm:ssAM: ");
        Scanner scin5 = new Scanner(System.in);
        String timeStr = scin5.next();
        String [] parts = timeStr.split(":");
        if (parts[2].substring(2).equals("PM")) {
            parts[0] = String.valueOf(Integer.valueOf(parts[0]) + 12);
        }
        System.out.println("Reformated, your time now looks like this:\n" + parts[0] + ":" + parts[1] + ":" + parts[2].substring(0,2) + " Uhr");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FreshScreen.freshScreen();
    }
}
