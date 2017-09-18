import java.util.Scanner;

public class B {

    public static void staircase() {

        System.out.println("Please input the height of the staircase: ");
        Scanner scin3 = new Scanner(System.in);
        int a = scin3.nextInt();

        for (int h = 0; h < 2; h++) {
            int letter = 65;

            for (int i = 0; i < a; i++) {
                System.out.println();
                for (int k = a; k > 0 + i + 1; k--) {

                    System.out.printf(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    if (h == 0) {
                        System.out.printf("#");
                    } else {
                        System.out.printf("%s", (char) letter);
                    }
                }
                if (letter < 90) {
                    letter++;
                } else {
                    letter = letter - 25;
                }
            }
            System.out.println();
        }
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FreshScreen.freshScreen();
    }

}

