package ua.nure.jfm.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * @author Dmytro Kolesnykov
 */
class Part1Test extends Base {
	
	private static final PrintStream STD_OUT = System.out;
	
	private static final String[] EMPTY = {};

	@ParameterizedTest
	@CsvFileSource(delimiter = ';', resources = "part1.csv")
	void test(String input, String expected) {
		String[] args = input == null ? EMPTY : input.split("\\s+");
		if (expected == null) {
			expected = "";
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		try {
			System.setOut(ps);
			Part1.main(args);
		} finally {
			System.setOut(STD_OUT);
		}
		assertEquals(expected, baos.toString().trim());
		ps.close();
	}

}
