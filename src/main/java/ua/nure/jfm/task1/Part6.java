package ua.nure.jfm.task1;

import java.util.Arrays;

public class Part6 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Expected 1 arg, got " + args.length);
            return;
        }

        int x;
        try {
            x = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e);
            return;
        }

        System.out.printf("N: %d, Arr: %s%n", x, Arrays.toString(count(x)));
    }

    private static int[] count(int x) {
        int[] result = new int[x];
        result[0] = 1;
        int a = 1, b = 1, t;
        for(int i = 1; i < x; i++) {
            result[i] = b;
            t = a;
            a = b;
            b = t + a;
        }

        return result;
    }
}
