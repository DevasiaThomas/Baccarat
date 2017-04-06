
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Baccarat b = new Baccarat();
		ResultDisplay rd = new ResultDisplay();
		GameRunner controller = new GameRunner(b, rd);
		controller.gameStart();
	}
}
