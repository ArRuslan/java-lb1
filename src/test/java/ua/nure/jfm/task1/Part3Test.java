package ua.nure.jfm.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * @author Dmytro Kolesnykov
 */
class Part3Test extends Base {
	
	private static final PrintStream STD_OUT = System.out;
	
	@ParameterizedTest
	@CsvFileSource(delimiter = ';', resources = "part3.csv")
	void test(String input, String expected) {
		if (expected == null) {
			expected = "";
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		try {
			System.setOut(ps);
			Part3.main(new String[] { input });
		} finally {
			System.setOut(STD_OUT);
		}
		assertEquals(expected, baos.toString().trim());
		ps.close();
	}

}
