package PermMissingElement;

import java.util.Arrays;

public class PermMissingElement {

	public int solution(int[] A) {
		if (A == null || A.length == 0)
			return 1;

		Arrays.sort(A);

		if (A[0] != 1)
			return 1;

		if (A[A.length - 1] != A.length + 1)
			return A.length + 1;

		for (int i = 1; i < A.length; i++) {

			if (A[i] != (i + 1)) {
				return i + 1;
			}

		}

		return 0;
	}

}
