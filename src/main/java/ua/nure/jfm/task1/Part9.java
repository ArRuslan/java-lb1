package ua.nure.jfm.task1;

public class Part9 {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int[][][][][] arr = new int[2][2][2][2][2];

        for (int i = 0; i < 32; i++) {
            int i1 = i / 16;
            int i2 = (i % 16) / 8;
            int i3 = (i % 8) / 4;
            int i4 = (i % 4) / 2;
            int i5 = i % 2;

            arr[i1][i2][i3][i4][i5] = i + 1;
            System.out.print((i + 1) + " ");
        }

        System.out.println();
    }
}
