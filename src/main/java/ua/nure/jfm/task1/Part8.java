package ua.nure.jfm.task1;

public class Part8 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Expected 2 args, got " + args.length);
            return;
        }

        int n, m;
        try {
            n = Integer.parseInt(args[0]);
            m = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e);
            return;
        }

        System.out.printf("N: %d, M: %d, Result:%n", n, m);

        char[][] result = table(n, m);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] table(int n, int m) {
        char[][] result = new char[n][m];
        char last_ch = 'Ч';
        for(int i = 0; i < n; i++) {
            if(i >= 1 && result[i-1][0] == last_ch)
                last_ch = last_ch == 'Ч' ? 'Б' : 'Ч';
            for(int j = 0; j < m; j++) {
                result[i][j] = last_ch;
                last_ch = last_ch == 'Ч' ? 'Б' : 'Ч';
            }
        }

        return result;
    }
}
