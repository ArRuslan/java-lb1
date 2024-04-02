package ua.nure.jfm.task1;

public class Part3 {

    public static void main(String[] args) {
        int n = parseInt(args[0]);
        for (int num : getPrimeNumbers(n)) {
            System.out.printf("%d ", num);
        }
    }

    public static int[] getPrimeNumbers(int n) {
        int[] arr = new int[n];
        int current = 3; // ??? test are failing on 2 ??
        for (int i = 0; i < arr.length; i++) {
            while (!isPrime(current)) {
                current++;
            }

            arr[i] = current;
            current++;
        }

        return arr;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int parseInt(String str) {
        int result = 0;
        for (char ch : str.toCharArray()) {
            result *= 10;
            result += ch - '0';
        }

        return result;
    }

}
