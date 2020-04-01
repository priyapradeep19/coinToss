
import java.util.Random;

public class Coin {
	private String sideUp;

	public void toss() {
		Random rand = new Random();
		int randNumber;

		randNumber = rand.nextInt(2);
		if (randNumber == 0) {
			sideUp = "TAILS";
		} else {
			sideUp = "HEADS";
		}
	}

	public String getSideUp() {
		return sideUp;
	}

	public Coin() {
		toss();
	}
}
