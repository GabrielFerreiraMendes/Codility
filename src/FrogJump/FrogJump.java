package FrogJump;

public class FrogJump {

	public int solution(int X, int Y, int D) {

		if (X > Y) {
			return 0;
		}

		int cont = X, jumpCount = 0;

		while (cont + D <= Y) {
			jumpCount++;

			cont += D;
		}

		if (cont < Y) {
			jumpCount++;
		}

		return jumpCount;
	}

}
