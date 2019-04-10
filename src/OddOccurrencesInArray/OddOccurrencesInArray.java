package OddOccurrencesInArray;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public int solution(int[] A) {

		Arrays.parallelSort(A);

		int cont = 0, last = A[0];

		for (int i = 0; i < A.length; i++) {
			if (A[i] == last) {
				cont++;
			} else {
				if (cont % 2 != 0) {
					return last;
				} else {
					last = A[i];
					cont = 1;
				}
			}
		}

		return last;
	}

}
