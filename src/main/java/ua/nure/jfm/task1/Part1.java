package ua.nure.jfm.task1;

public class Part1 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.err.println("Expected 2 args, got "+args.length);
            return;
        }
        int x, y;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Error: "+e);
            return;
        }

        System.out.printf("X: %d, Y: %d, Найбільший спільний дільник: %d%n", x, y, gcd(x, y));
    }

    private static int gcd(int x, int y) {
        while(y > 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }
}
