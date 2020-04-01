

public class CoinTest {
	public static void main(String[] args) {
		Coin coin = new Coin();
		int numberOfHeads = 0;
		int numberOfTails = 0;
		int numberOfTosses = 20;

		System.out.println("INITIAL SIDE: " + coin.getSideUp() + "\n");

		for (int currentToss = 1; currentToss <= 20; currentToss++) {
			coin.toss();

			if (coin.getSideUp() == "HEADS") {
				numberOfHeads += 1;
			} else {
				numberOfTails += 1;
			}
			System.out.println("Toss " + currentToss + ": " + coin.getSideUp());
		}
		System.out.println("\n" + "OUT OF " + numberOfTosses + " TOSSES, THERE WERE " + numberOfHeads + " HEADS AND  "
				+ numberOfTails + " TAILS.");
	}
}
