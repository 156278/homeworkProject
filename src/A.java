import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import static java.lang.Math.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class A {

    public static void addAndStats() {
        ArrayList<Integer> ints = new ArrayList<>();
        //int[] ints = {0};
        int a = 1;
        int min = 0, max = 0;
        double arithAVG = 0.0;
        double geoAVG = 0.0;
        int counter = 0;

        Scanner scin2 = new Scanner(System.in);
        System.out.println("This part of my homework will add together as many integers as are entered, no matter which sign, as well as output min, max and the average of said numbers until 0 is entered: ");
        while (a != 0) {
            a = scin2.nextInt();
            if (a != 0) {
                ints.add(a);
                counter++;
            }
        }
        System.out.println("The entered integers where: " + ints);
        a = 0;
        for (int i = 0; i < ints.size(); i++) {
            a += ints.get(i);
        }
        System.out.println("The sum of the input is: " + a);

        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) > max) {
                max = ints.get(i);
            }

        }
        min = max;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) < min) {
                min = ints.get(i);
            }

        }

        System.out.println("The maximum value entered was: " + max);
        System.out.println("The minimum value entered was: " + min);
        System.out.println("The arithmetic average is: " + ((double)a / (double)ints.size()));
        System.out.println("The geometric average is: " + Math.pow((double)a,1.0/ints.size()));
    }

}
