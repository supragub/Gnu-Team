package GnuTeam.BaratokKozt;

import java.util.ArrayList;
import java.util.Random;

public class Hand {

	ArrayList<Card> cardsInHand = new ArrayList<Card>();
	ArrayList<Card> aiCards = new ArrayList<Card>();

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

	public void getAICards(ArrayList<Card> cardList) {
		int counter = 1;
		while (counter <= 16) {
			for (Card card : cardList) {
				if (!cardsInHand.contains(card)) {
					aiCards.add(card);
					counter++;
				}
			}
		}
	}

	public void printIn(ArrayList<Card> cList) {
		for (Card c : cList) {
			System.out.println(c.nev);
		}
	}

}
