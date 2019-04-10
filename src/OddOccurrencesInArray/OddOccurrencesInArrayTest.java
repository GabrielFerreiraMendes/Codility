package OddOccurrencesInArray;

public class OddOccurrencesInArrayTest {

	public static void main(String[] args) {
		OddOccurrencesInArray oddNumber = new OddOccurrencesInArray();

		int[] A = { 9, 3, 9, 3, 9, 7, 9 };

		int B = oddNumber.solution(A);

		System.out.println(B);
	}

}
