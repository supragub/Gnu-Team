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

}
