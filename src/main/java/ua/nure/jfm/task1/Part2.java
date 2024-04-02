package ua.nure.jfm.task1;

public class Part2 {
	
	public static void main(String[] args) {
		int[] ints = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			ints[i] = parseInt(args[i]);
		}

		int gcd = ints[0];
		for(int i = 1; i < args.length; i++) {
			gcd = calcGcd(gcd, ints[i]);
		}
		int lcm = ints.length > 1 ? calcLcm(ints[0], ints[1]) : ints[0];
		for(int i = 2; i < args.length; i++) {
			lcm = calcLcm(lcm, ints[i]);
		}

		System.out.printf("%d %d", gcd, lcm);
	}

	private static int calcGcd(int x, int y) {
		while(y > 0) {
			int t = x % y;
			x = y;
			y = t;
		}
		return x;
	}

	private static int calcLcm(int x, int y) {
		return (x * y) / calcGcd(x, y);
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
