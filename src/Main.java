import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {


    public static void main(String[] args) {
        System.out.println("This is the menu to my homework:\nPlease choose which part (1-4) you want to load:\n");
        Scanner scin = new Scanner(System.in);
        int a = scin.nextInt();
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

    }
}   