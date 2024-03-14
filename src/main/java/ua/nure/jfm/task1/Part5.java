package ua.nure.jfm.task1;

public class Part5 {

    public static void main(String[] args) {
        args = new String[] { "1", "5", "3", "0", "5", "2", "1" };
        int[] ints = new int[args.length];
        for(int i = 0; i < args.length; i++)
            ints[i] = parseInt(args[i]);

        for(int i : sequence(ints)) {
            System.out.print(i+" ");
        }
    }

    public static int[] sequence(int[] ar) {
        if (ar == null)
            return null;

        int[] tmp = new int[ar.length];
        int res_idx = 0;
        boolean seq_start = true;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < ar[i - 1]) {
                if (seq_start || tmp[res_idx - 1] != ar[i - 1]) {
                    seq_start = false;
                    tmp[res_idx++] = ar[i - 1];
                }
                tmp[res_idx++] = ar[i];
            } else {
                seq_start = true;
            }
        }

        int[] result = new int[res_idx];
        for (int i = 0; i < result.length; i++)
            result[i] = tmp[i];

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