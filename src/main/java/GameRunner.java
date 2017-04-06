
public class GameRunner {
	Baccarat b;
	ResultDisplay rd;

	public GameRunner(Baccarat b, ResultDisplay rd) {
		this.b = b;
		this.rd = rd;
	}

	public void gameStart() {
		b.coups();
		displayResults(b.getPercentages());

	}

	public void displayResults(float[] percentages) {
		rd.displayResults(percentages);
	}
}