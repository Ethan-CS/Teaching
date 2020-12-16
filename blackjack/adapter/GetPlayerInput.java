package io.github.ethankelly;

import java.util.Scanner;

import static java.lang.System.in;

public class GetPlayerInput implements IPlayerInput {

    private static Scanner ki = new Scanner(in);

    public static String getStringInput() {
        return ki.nextLine();
    }

    public static int getIntInput() {
        return ki.nextInt();
    }
}
