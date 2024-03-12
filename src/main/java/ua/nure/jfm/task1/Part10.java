package ua.nure.jfm.task1;

public class Part10 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Expected 1 args, got " + args.length);
            return;
        }

        int x;
        try {
            x = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e);
            return;
        }

        System.out.printf("X: %d, Result:%n", x);

        int[][] result = triangle(x);
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] triangle(int x) {
        int[][] result = new int[x][];

        for (int i = 0; i < x; i++) {
            result[i] = new int[i + 1];
            result[i][0] = 1;
            result[i][i] = 1;

            for (int j = 1; j < i; j++) {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
            }
        }

        return result;
    }
}
