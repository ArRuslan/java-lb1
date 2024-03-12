package ua.nure.jfm.task1;

import java.util.Arrays;

public class Part7 {
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

        System.out.printf("N: %d, Primes: %s%n", x, Arrays.toString(primes(x)));
    }

    private static int[] primes(int x) {
        int[] result = new int[x];
        int i = 0;
        int num = 2;
        while(i != x) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                result[i++] = num;

            num++;
        }

        return result;
    }
}
