package ua.nure.jfm.task1;

public class Part5 {
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

        System.out.printf("N: %d, Count: %d%n", x, count(x));
    }

    private static int digitsSum(int d) {
        int result = 0;
        while(d > 0) {
            result += d % 10;
            d /= 10;
        }
        return result;
    }

    private static boolean hasTwoZeroes(int d, int n) {
        if(d < (n / 100))
            return true;

        int zeroes = 0;
        while(d > 0) {
            if(d % 10 == 0)
                zeroes++;
            else
                zeroes = 0;
            if(zeroes >= 2)
                return true;
            d /= 10;
        }

        return false;
    }

    private static int count(int x) {
        int n = (int) Math.pow(10, x / 2);
        int count = 0;

        for(int i = 1; i < n; i++) {
            if(hasTwoZeroes(i, n))
                continue;
            int d = digitsSum(i);
            for(int j = 1; j < n; j++) {
                if(hasTwoZeroes(i, n))
                    continue;
                if(d == digitsSum(j))
                    count++;
            }
        }

        return count;
    }
}
