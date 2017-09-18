import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {


    public static void main(String[] args) {
        int a = 1;
        while (a != 0) {
            System.out.println("************************************************************************************\nThis is the menu to my homework:\n\n1. Adding & Stats\n2. Staircase\n3. Calculation of diagonal sums in matrices\n4. Time converter\n0. Exit\n\n************************************************************************************\n\nPlease choose which part (0-4) you want to load:\n");
            Scanner scin1 = new Scanner(System.in);
            a = scin1.nextInt();
            System.out.printf("Loading " + a);
            for (int i = 0; i < 3; i++) {
                System.out.printf(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            FreshScreen.freshScreen();
            switch (a) {
                case 1:
                    A.addAndStats();
                    break;
                case 2:
                    B.staircase();
                    break;
                case 3:
                    C.diagSum();
                    break;
                case 4:
                    D.convTime();
                    break;


            }

        }
    }
}