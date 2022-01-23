package domaci_21_1_22;

import java.util.ArrayList;

public abstract class Radnik {
	//Kreirati abstraktnu klasu Radnik koja ima:
	//ime i prezime
	//niz sektora u kojima radi
	//abstraktnu metodu koja vraca platu radnika
	//metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	
	protected String imeIPrezime;
	protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();

	public Radnik() {
		
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	public ArrayList<Sektor> getNizSektora() {
		return nizSektora;
	}

	public void setNizSektora(ArrayList<Sektor> nizSektora) {
		this.nizSektora = nizSektora;
	}

	public abstract double plata();
	
	public void zaposliUSektor(Sektor sektor) {
		nizSektora.add(sektor);
	}
}



