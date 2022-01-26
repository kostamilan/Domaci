package domaci_24_1_22;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucijaZaFlasu;
	private boolean placaSeKaucija;
	private double osnovnaCena;
	
	
	public StaklenaAmbalaza() {
		super();
		
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaFlasu,
								boolean placaSeKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if(this.placaSeKaucija == true) {
			double cenaSaKaucijom = this.getOsnovnaCena() * 1.2 + this.getKaucijaZaFlasu();
			return cenaSaKaucijom;
		}else {
		double	cenaBezKaucije = this.getOsnovnaCena() * 1.2;
			return cenaBezKaucije;
		}
		
	}

	@Override
	public void stampaj() {
		System.out.println("Naziv artikla: " + this.getNazivArtikla());
		System.out.println("Osnovna cena je " + this.osnovnaCena + " din.");
		System.out.println("Ambalaza je: Staklena ambalaza");
		System.out.println("Bar kod: " + this.barkod);
		System.out.println("Cena : " + this.cenaArtikla());
		
	}

	
}
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
