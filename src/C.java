import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class C {
    public static void diagSum() {
        Scanner scin4 = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("Please define size of matrix: ");
        a = scin4.nextInt();
        int[][] matr = new int[a][a];
        System.out.println("Please input values followed by enter: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matr[i][j] = scin4.nextInt();
                FreshScreen.freshScreen();
                System.out.println("Please input values followed by enter: ");
                for (int k = 0; k < a; k++) {
                    for (int l = 0; l < a; l++) {
                        System.out.printf("%d,", matr[k][l]);
                    }
                    System.out.printf("\n");
                }
            }
        }

        for (int i = 0; i < a; i++) {
            b += matr[i][i];

        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            c += matr[i][a - i - 1];

        }
        System.out.println("\nThe sum of diagonal numbers minus the sum of the other diagonal numbers equals: " + (b - c) + "\n");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FreshScreen.freshScreen();
    }

}

