package ua.nure.jfm.task1;

public class Part2 {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.err.println("Expected 1 arg, got "+args.length);
            return;
        }

        int x;
        try {
            x = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: "+e);
            return;
        }

        System.out.printf("X: %d, Сума цифр: %d%n", x, sum(x));
    }

    private static int sum(int x) {
        int result = 0;
        while(x > 0) {
            result += x % 10;
            x /= 10;
        }
        return result;
    }
}
