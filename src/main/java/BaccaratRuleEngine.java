/**
 * The Baccarat Rule Engine
 * @author thoma
 * @since 0.0.1
 */
public class BaccaratRuleEngine {
	/**
	 * @param pScore Input for Player's score
	 * @param bScore Input for Banker's score
	 * @param s      An object of the shoe class being used in the Baccarat game
	 * @return		 Returns the difference between the final player and banker scores.
	 */
	public static int returnResult(int pScore, int bScore, Shoe s) {
		pScore = pScore % 10;
		bScore = bScore % 10;
		boolean pStand = false;
		int pThird = 0;
		if (pScore <= 7 && bScore <= 7) {
			if (pScore < 6) {
				pThird = (s.drawCard());
				pScore += pThird;
				pScore = pScore % 10;
				pStand = true;
			}
			if (!pStand) {
				if (bScore < 6) {
					bScore += (s.drawCard());
					bScore = bScore % 10;
				}
			} else {
				switch (bScore) {
				case 0:
				case 1:
				case 2:
					bScore += (s.drawCard());
					break;
				case 3:
					if (pThird != 8) {
						bScore += (s.drawCard());
					}
					break;
				case 4:
					if (pThird == 2 || pThird == 3 || pThird == 4 || pThird == 5 || pThird == 6 || pThird == 7) {
						bScore += (s.drawCard());
					}
					break;
				case 5:
					if (pThird == 4 || pThird == 5 || pThird == 6 || pThird == 7) {
						bScore += (s.drawCard());
					}
					break;
				case 6:
					if (pThird == 6 || pThird == 7) {
						bScore += (s.drawCard());
					}
					break;
				}
				bScore = bScore % 10;
			}
		}
		return pScore - bScore;
	}
}
