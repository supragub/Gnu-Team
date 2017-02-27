package GnuTeam.BaratokKozt;

public class Card {

	String nev;
	int igazMondas;
	int batorsag;
	int kivancsisag;

	public Card(String nev, int igazMondas, int batorsag, int kivancsisag) {
		this.nev = nev;
		this.igazMondas = igazMondas;
		this.batorsag = batorsag;
		this.kivancsisag = kivancsisag;

	}

	public String getNev() {
		return nev;
	}

	public int getIgazMondas() {
		return igazMondas;
	}

	public int getBatorsag() {
		return batorsag;
	}

	public int getKivancsisag() {
		return kivancsisag;
	}

	public void comparableIgazMondas(Card card1) {
		if (card1.igazMondas > this.igazMondas) {
			System.out.println(card1.nev + " nyert.");
		} else if (card1.igazMondas < this.igazMondas) {
			System.out.println(this.nev + " nyert.");
		} else {
			System.out.println("Döntetlen. Válassz más tulajdonságot.");
		}
	}

	public void comparableBatorsag(Card card1) {
		if (card1.batorsag > this.batorsag) {
			System.out.println(card1.nev + " nyert.");
		} else if (card1.batorsag < this.batorsag) {
			System.out.println(this.nev + " nyert.");
		} else {
			System.out.println("Döntetlen. Válassz más tulajdonságot.");
		}
	}

	public void comparableKivancsisag(Card card1) {
		if (card1.kivancsisag > this.kivancsisag) {
			System.out.println(card1.nev + " nyert.");
		} else if (card1.kivancsisag < this.kivancsisag) {
			System.out.println(this.nev + " nyert.");
		} else {
			System.out.println("Döntetlen. Válassz más tulajdonságot.");
		}
	}

}
