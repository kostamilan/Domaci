package domaci_24_1_22;

import java.util.ArrayList;

import predavanja_24_1_22_drugizadatak.Objekat;

public class Korpa {

	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();
	


	public Korpa(ArrayList<Ambalaza> nizAmbalaza) {
		super();
		this.nizAmbalaza = nizAmbalaza;
	}

	public Korpa() {
			
	}

	public ArrayList<Ambalaza> getNizAmbalaza() {
		return nizAmbalaza;
	}

	public void setNizAmbalaza(ArrayList<Ambalaza> nizAmbalaza) {
		this.nizAmbalaza = nizAmbalaza;
	}
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		nizAmbalaza.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barkod) {
	for (int i = 0; i < this.nizAmbalaza.size(); i++) {
		if(this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
			this.nizAmbalaza.remove(i);
		}
	}
	}
	
	private double cenaSvihAmbalazaSaPopustom (double popust) {
		double cenaSvihAmbalazaSaPopustom = 0;
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			cenaSvihAmbalazaSaPopustom = cenaSvihAmbalazaSaPopustom + this.nizAmbalaza.get(i).cenaArtikla();
		}
		return cenaSvihAmbalazaSaPopustom - (cenaSvihAmbalazaSaPopustom * (popust / 100));
	}
	
	public double ukupnaCenaKorpeSuperKartica(SuperKartica superKartica) {
		return cenaSvihAmbalazaSaPopustom(superKartica.getPopust());
	}
	
	public void stampaj() {
		for(int i = 0; i < nizAmbalaza.size(); i++) {
			this.nizAmbalaza.get(i).stampaj();
		}
	}
}

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije 
//se prima Super karticu iz koje se cita popust.
