package FrogJump;

public class FrogJump {

	public int solution(int X, int Y, int D) {

		if (X > Y)
			return 0;

		if ((double) ((Y - X) / D) < (((double) Y - (double) X) / (double) D)) {
			return ((Y - X) / D) + 1;
		}

		return ((Y - X) / D);
	}

}
