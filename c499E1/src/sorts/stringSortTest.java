package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class stringSortTest {

	@Test
	void test() {
		stringSort s = new stringSort();
		String[] a1 = {"a", "b", "d", "c"};
		System.out.println(Arrays.toString(s.stringSort(a1)));
	}

}
