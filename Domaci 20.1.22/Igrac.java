package domaci_20_1_22;

public class Igrac extends Osoba {
	
	private int brojNaDresu;
	private String pozicijaNaTerenu;
	private boolean kapiten;
	
	
	public Igrac() {
		super();
		
	}
	
	public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.brojNaDresu = this.brojNaDresu;
		this.pozicijaNaTerenu = this.pozicijaNaTerenu;
		this.kapiten = this.kapiten;
		
	}

	public int getBrojNaDresu() {
		return brojNaDresu;
	}

	public void setBrojNaDresu(int brojNaDresu) {
		this.brojNaDresu = brojNaDresu;
	}

	public String getPozicijaNaTerenu() {
		return pozicijaNaTerenu;
	}

	public void setPozicijaNaTerenu(String pozicijaNaTerenu) {
		this.pozicijaNaTerenu = pozicijaNaTerenu;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void stampajIgraca() {
		this.stampajOsobu();
		System.out.println("Broj na dresu: " + this.brojNaDresu);
		System.out.println("Pozicija na terenu: " + this.pozicijaNaTerenu);
		System.out.println("");
		
	}
	
	public boolean jeKapiten(boolean igrac) {
		if (igrac == true) {
			System.out.println("Igrac je kapiten.");
			return true;
		}else {
			System.out.println("Igrac nije kapiten.");
			return false;
		}
		
		
	}
}
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
