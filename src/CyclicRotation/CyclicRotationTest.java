package CyclicRotation;

import java.util.Arrays;

public class CyclicRotationTest {

	public static void main(String[] args) {
		CyclicRotation cycle = new CyclicRotation();

		int[] C = {};
		int[] A = cycle.solution(C, 3);

		System.out.println(Arrays.toString(A));

	}

}
