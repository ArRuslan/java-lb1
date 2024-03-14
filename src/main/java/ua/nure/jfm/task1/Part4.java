package ua.nure.jfm.task1;

public class Part4 {
	
    public static void main(String[] args) {
    	int num = parseInt(args[0]);

        System.out.printf("%d = ", num);

        int currentPrime = 2;
        int currentExp = 0;
        boolean firstPrime = true;
        while(num > 1) {
            while(num % currentPrime == 0) {
                num /= currentPrime;
                currentExp++;
            }
            if(currentExp > 0) {
                if(!firstPrime)
                    System.out.print(" x ");
                System.out.printf("%d^%d", currentPrime, currentExp);
                firstPrime = false;
            }
            currentPrime = nextPrime(currentPrime);
            currentExp = 0;
        }
    }

    public static int nextPrime(int x) {
        int current = x+1;
        while(!isPrime(current))
            current++;

        return current;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
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

