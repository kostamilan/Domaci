package domaci_17_1_22drugi;

public class Transakcija {

	private String id;
	private Racun racunSaKogSeSalje;
	private Racun racunNaKojiSeSalje;
	
	private Racun racun;
	
	public Transakcija() {
		
	}
	
	public Transakcija(String id, Racun racunSaKogSeSalje, Racun racunNaKojiSeSalje) {
		this.id = id;
		this.racunSaKogSeSalje = racunSaKogSeSalje;
		this.racunNaKojiSeSalje = racunNaKojiSeSalje;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Racun getRacunSaKogSeSalje() {
		return racunSaKogSeSalje;
	}
	public void setRacunSaKogSeSalje(Racun racunSaKogSeSalje) {
		this.racunSaKogSeSalje = racunSaKogSeSalje;
	}
	
	public Racun getRacunNaKojiSeSalje() {
		return racunNaKojiSeSalje;
	}
	
	public void setRacunNaKojiSeSalje(Racun racunNaKojiSeSalje) {
		this.racunNaKojiSeSalje = racunNaKojiSeSalje;
	}
	
	private double provizija(double visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		}
		else {
			return visinaTransakcije/100;
		}
	
	}
	
	public void izvrsiTransakciju(int vrednostTransakcije) {
		if (this.racunSaKogSeSalje.getTrenutnoStanje() - (vrednostTransakcije + provizija(vrednostTransakcije)) >= 0) {
			this.racunSaKogSeSalje.menjaTrenutnoStanje(-(vrednostTransakcije + provizija(vrednostTransakcije)));
			this.racunNaKojiSeSalje.menjaTrenutnoStanje(vrednostTransakcije);
		}
		else {
			System.out.println("Nemate dovoljno sredstava.");
		}
	
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}

	public void stampajTrnsakcija() {
		System.out.println("Poslato sa: ");
		this.racunSaKogSeSalje.stampaj();
		System.out.println("Poslato na: ");
		this.racunNaKojiSeSalje.stampaj();
		
	}
}

