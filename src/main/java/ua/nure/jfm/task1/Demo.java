package ua.nure.jfm.task1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Part1 -----------------");
		Part1.main(new String[] { "A1", "B11 22 C", "D" }); // 34 7

		System.out.println("\nPart2 -----------------");
		Part2.main(new String[] { "12", "18", "24" }); // 6 72

		System.out.println("\nPart3 -----------------");
		Part3.main(new String[] { "5" }); // 3 5 7 11 13

		System.out.println("\nPart4 -----------------");
		Part4.main(new String[] { "360" }); // 360 = 2^3 x 3^2 x 5^1

		System.out.println("\nPart5 -----------------");
		Part5.main(new String[] { "1", "5", "3", "0", "5", "2", "1" }); // 5 3 0 5 2 1
	}

}
