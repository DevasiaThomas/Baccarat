import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shoe {
	private ArrayList<Integer> deck;
	private int drawPointer;
	
	public Shoe(){
		Integer[] temp = {1,2,3,4,5,6,7,8,9,0,0,0,0};
		deck = new ArrayList<Integer>();
		for(int i=1;i<=32;i++) {
			deck.addAll(Arrays.asList(temp));
		}
		Collections.shuffle(deck);
		drawPointer=0;
		
	}
	public boolean canIPlay() {
		if(deck.size()-drawPointer<6) {
			return false;
		}
		return true;
	}
	public int drawCard() {
		return deck.get(drawPointer++).intValue();
	}
}
