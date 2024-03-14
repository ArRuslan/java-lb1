package ua.nure.jfm.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * @author Dmytro Kolesnykov
 */
class Part4Test extends Base {
	
	private static final PrintStream STD_OUT = System.out;
	
	@ParameterizedTest
	@CsvFileSource(delimiter = ';', resources = "part4.csv")
	void test(String input, String expected) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		try {
			System.setOut(ps);
			Part4.main(new String[] { input });
		} finally {
			System.setOut(STD_OUT);
		}
		assertEquals(expected, baos.toString().trim());
		ps.close();
	}

}
