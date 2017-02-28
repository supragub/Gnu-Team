package GnuTeam.BaratokKozt;

import java.util.ArrayList;
import java.util.Random;

public class Hand {

	ArrayList<Card> cardsInHand = new ArrayList<Card>();

	public void getCards(ArrayList<Card> cardList) {
		Random random = new Random();
		int counter = 1;
		while (counter <= 16) {
			int rand = random.nextInt(cardList.size());
			Card randomCard = cardList.get(rand);
			if (!cardsInHand.contains(randomCard)) {
				cardsInHand.add(randomCard);
				counter++;
			}
		}
	}

	public void printIn() {
		for (Card c : cardsInHand) {
			System.out.println(c.nev);
		}
	}

}
