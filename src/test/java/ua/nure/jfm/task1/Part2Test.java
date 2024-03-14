package ua.nure.jfm.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * @author Dmytro Kolesnykov
 */
class Part2Test extends Base {
	
	private static final PrintStream STD_OUT = System.out;
	
	private static final String[] EMPTY = {};

	@ParameterizedTest
	@CsvFileSource(delimiter = ';', resources = "part2.csv")
	void test(String input, String expected) {
		String[] args;
		expected = expected == null ? "" : expected.replaceAll("_", " ");
		args = input == null ? EMPTY : input.split("\\s+");
		for (int j = 0; j < args.length; ++j) {
			args[j] = args[j].replace("_", " ");
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		try {
			System.setOut(ps);
			Part2.main(args);
		} finally {
			System.setOut(STD_OUT);
		}
		String actual = baos.toString();
		assertEquals(expected, actual);
		ps.close();
	}
	
}
