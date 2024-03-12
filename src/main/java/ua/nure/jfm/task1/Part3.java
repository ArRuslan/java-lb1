package ua.nure.jfm.task1;

public class Part3 {
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

        System.out.printf("X: %d, Просте: %b%n", x, is_prime(x));
    }

    private static boolean is_prime(int x) {
        for (int i = 2; i < x / 2; i++)
            if (x % i == 0)
                return false;

        return true;
    }
}
