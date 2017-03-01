package GnuTeam.BaratokKozt;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

	public Card showCard(ArrayList<Card> cList) {
		System.out.println(cList.get(0).nev + "\nIgazmondás: " + cList.get(0).igazMondas + "\nBalhézás: "
				+ cList.get(0).balhezas + "\nFéltékenység: " + cList.get(0).feltekenyseg);
		return cList.get(0);
	}

	public void removeFirstCard(ArrayList<Card> cList) {
		cList.remove(cList.get(0));
	}

	public int chooseSkill() {
		Scanner input = new Scanner(System.in);
		System.out.println("Válassz egy tulajdonságot. (Igazmondás: 1; Balhézás: 2; Féltékenység: 3)");
		int inp = 0;
		while (inp > 3 || inp < 1) {
			inp = input.nextInt();
			if (inp > 3 || inp < 1) {
				System.err.println("1-3 közötti számot adj meg!!!");
			}
		}
		if (inp == 1) {
			return cardsInHand.get(0).igazMondas;
		} else if (inp == 2) {
			return cardsInHand.get(0).balhezas;
		} else if (inp == 3) {
			return cardsInHand.get(0).feltekenyseg;
		}
		return 1;
	}

}
