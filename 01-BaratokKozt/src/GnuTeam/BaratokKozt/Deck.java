package GnuTeam.BaratokKozt;

import java.util.ArrayList;

public class Deck {

	ArrayList<Card> cardList = new ArrayList<Card>();

	public void printOut() {
		for (Card c : cardList) {
			System.out.println(c.nev);
		}
	}

}
