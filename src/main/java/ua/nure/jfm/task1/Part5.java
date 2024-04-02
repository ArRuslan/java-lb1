package ua.nure.jfm.task1;

public class Part5 {

    public static void main(String[] args) {
        args = new String[] { "1", "5", "3", "0", "5", "2", "1" };
        int[] ints = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            ints[i] = parseInt(args[i]);
        }

        for(int i : sequence(ints)) {
            System.out.print(i+" ");
        }
    }

    public static int[] sequence(int[] ar) {
        if (ar == null) {
            return null;
        }

        int[] tmp = new int[ar.length];
        int resIdx = 0;
        boolean seqStart = true;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < ar[i - 1]) {
                if (seqStart || tmp[resIdx - 1] != ar[i - 1]) {
                    seqStart = false;
                    tmp[resIdx++] = ar[i - 1];
                }
                tmp[resIdx++] = ar[i];
            } else {
                seqStart = true;
            }
        }

        int[] result = new int[resIdx];
        for (int i = 0; i < result.length; i++) {
            result[i] = tmp[i];
        }

        return result;
    }

    private static int parseInt(String str) {
        int result = 0;
        for(char ch : str.toCharArray()) {
            result *= 10;
            result += ch - '0';
        }

        return result;
    }

}