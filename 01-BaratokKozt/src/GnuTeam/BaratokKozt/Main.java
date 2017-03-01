package GnuTeam.BaratokKozt;

public class Main {

	public static void main(String[] args) {
		Logo logo = new Logo();
		logo.logo();
		Deck deck = new Deck();
		Card card1 = new Card("Berényi András", 1, 3, 1);
		Card card2 = new Card("Berényi Miklós", 1, 9, 7);
		Card card3 = new Card("Szentmihályi Zsófia", 1, 2, 7);
		Card card4 = new Card("Berényi Attila", 1, 8, 5);
		Card card5 = new Card("Kertész Géza", 1, 3, 5);
		Card card6 = new Card("Kertész Vilmos", 1, 4, 3);
		Card card7 = new Card("Magdi Anyus", 1, 10, 9);
		Card card8 = new Card("Magdi Anyus szelleme", 1, 10, 10);
		Card card9 = new Card("Bartha Zsolt", 1, 6, 6);
		Card card10 = new Card("Holmann Hanna", 1, 6, 3);
		Card card11 = new Card("Bartha Krisztián", 1, 6, 4);
		Card card12 = new Card("Berényi Claudia", 1, 7, 9);
		Card card13 = new Card("Egressy \"Tóni\" Antal", 1, 9, 6);
		Card card14 = new Card("Nádor Kinga", 1, 6, 7);
		Card card15 = new Card("Balogh Nóra", 1, 6, 6);
		Card card16 = new Card("Berényi Zsuzsa", 1, 6, 8);
		Card card17 = new Card("Berényi Kata", 1, 2, 5);
		Card card18 = new Card("Berényi Dániel", 1, 6, 1);
		Card card19 = new Card("Nagy Tóbiás & (F)Asztalos Kristóf", 1, 7, 6);
		Card card20 = new Card("Illés Vanda", 1, 6, 8);
		Card card21 = new Card("Illés Péter", 1, 10, 7);
		Card card22 = new Card("Illés Júlia", 1, 7, 10);
		Card card23 = new Card("Bokros Gizi", 1, 5, 8);
		Card card24 = new Card("Bartha Linda", 1, 7, 6);
		Card card25 = new Card("Bokros Ádám", 1, 8, 6);
		Card card26 = new Card("Fekete Alíz", 1, 6, 8);
		Card card27 = new Card("Fekete Luca", 1, 3, 5);
		Card card28 = new Card("Cheng", 1, 7, 6);
		Card card29 = new Card("Berci", 1, 9, 9);
		Card card30 = new Card("Berényi Balázs", 1, 8, 7);
		Card card31 = new Card("A pincér", 1, 1, 1);
		Card card32 = new Card("Novák László", 1, 8, 3);
		deck.cardList.add(card1);
		deck.cardList.add(card2);
		deck.cardList.add(card3);
		deck.cardList.add(card4);
		deck.cardList.add(card5);
		deck.cardList.add(card6);
		deck.cardList.add(card7);
		deck.cardList.add(card8);
		deck.cardList.add(card9);
		deck.cardList.add(card10);
		deck.cardList.add(card11);
		deck.cardList.add(card12);
		deck.cardList.add(card13);
		deck.cardList.add(card14);
		deck.cardList.add(card15);
		deck.cardList.add(card16);
		deck.cardList.add(card17);
		deck.cardList.add(card18);
		deck.cardList.add(card19);
		deck.cardList.add(card20);
		deck.cardList.add(card21);
		deck.cardList.add(card22);
		deck.cardList.add(card23);
		deck.cardList.add(card24);
		deck.cardList.add(card25);
		deck.cardList.add(card26);
		deck.cardList.add(card27);
		deck.cardList.add(card28);
		deck.cardList.add(card29);
		deck.cardList.add(card30);
		deck.cardList.add(card31);
		deck.cardList.add(card32);
		Hand hand = new Hand();
		hand.getCards(deck.cardList);
		hand.getAICards(deck.cardList);
		Card myCard = hand.showCard(hand.cardsInHand);
		hand.chooseSkill();
		Card AICard = hand.showCard(hand.aiCards);
		myCard.comparableIgazMondas(AICard);

	}

}
