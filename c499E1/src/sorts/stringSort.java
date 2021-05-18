package sorts;

import java.util.*;

public class stringSort {
	
	public String[] stringSort(String[] a1) {
		for (int i = 0; i < a1.length - 1; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i].compareTo(a1[j]) > 0) {
					String temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		return a1;
	}

}