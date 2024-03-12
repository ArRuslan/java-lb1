package ua.nure.jfm.task1;

public class Part4 {
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

        System.out.printf("N: %d, Сума: %d%n", x, sum(x));
    }

    private static int sum(int x) {
        int result = 1;
        int current_fact = 1;
        boolean sign = false;
        for (int i = 2; i <= x ; i++) {
            sign = !sign;
            current_fact *= i;
            result += current_fact * (sign ? -1 : 1);
        }

        return result;
    }
}
