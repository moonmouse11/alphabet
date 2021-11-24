package com.ilyshkaprogger.alphabet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValue {
    private static String toPicture;
    private static int length;

    public static void printMeInChars() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Give me your word!");
            String string = scanner.nextLine();
            setToPicture(string);
            System.out.println("Give me size.");
            int value = scanner.nextInt();
            setLength(Math.max(value, 20));
            System.out.println("How much?");
            int cycle = scanner.nextInt();
            for (int i = 0; i < cycle; i++) {
                SwitchMatrix.toPrint();
            }
        } catch (InputMismatchException | InterruptedException e) {
            System.out.println("Maybe next time!!");
            printMeInChars();
        }
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        InputValue.length = length;
    }

    public static String getToPicture() {
        return toPicture;
    }

    public static void setToPicture(String toPicture) {
        InputValue.toPicture = toPicture;
    }

}
