package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class intSortTest {

	@Test
	void test() {
		intSort i = new intSort();
		int[] a1 = {1,3,2,4,5};
		System.out.println(Arrays.toString(i.sortInt(a1)));
	}

}
