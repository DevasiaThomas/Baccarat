
public class Baccarat {
	private Shoe shoe;
	private int playerWins;
	private int bankerWins;
	private int totalCoups;

	public Baccarat() {
		shoe = new Shoe();
		playerWins = bankerWins = 0;
	}

	public void coups() {
		while (shoe.canIPlay()) {
			int pScore = 0, bScore = 0; // scores within a game
			pScore += shoe.drawCard();
			pScore += shoe.drawCard();
			bScore += shoe.drawCard();
			bScore += shoe.drawCard();
			int result = BaccaratRuleEngine.returnResult(pScore, bScore, shoe);
			if (result > 0) {
				playerWins++;
			}
			if (result < 0) {
				bankerWins++;
			}
			totalCoups++;
		}
		System.out.println("Deck over, Computing Results\n");
	}

	public float[] getPercentages() {
		// float a=(float)(Math.random()*100);
		float pPercentage = ((playerWins) * 100) / (float) (totalCoups);
		float bPercentage = ((bankerWins) * 100) / (float) (totalCoups);
		return new float[] { pPercentage, bPercentage, 100 - pPercentage - bPercentage };
	}
}
