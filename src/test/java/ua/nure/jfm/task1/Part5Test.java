package ua.nure.jfm.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * @author Dmytro Kolesnykov
 */
class Part5Test extends Base {

	@ParameterizedTest
	@CsvFileSource(delimiter = ';', resources = "part5.csv")
	void test(String input, String expected) {
		if (expected != null) {
			if ("_".equals(expected)) {
				expected = "";
			} else {
				expected = expected.replaceAll("\\s+", " ");
			}
		}
		int[] ar = null;
		if (input != null) {
			ar = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}
		int[] result = Part5.sequence(ar);
		String actual;
		if (result == null) {
			actual = null;
		} else {
			actual = IntStream.of(result)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" "));
		}
		assertEquals(expected, actual);
	}

}
