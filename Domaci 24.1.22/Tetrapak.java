package domaci_24_1_22;

public class Tetrapak extends Ambalaza {

	private boolean reciklaza;
	private double osnovnaCena;
	
	
	public Tetrapak() {
		super();
		
	}

	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if(reciklaza == true) {
			double cena = (tezinaPakovanja() * 1.5 + this.getOsnovnaCena());
			return cena;
		}else {
			return this.getOsnovnaCena();
		}
		
	}

	@Override
	public void stampaj() {
		System.out.println("Pakovanje: Tetrapak");
		System.out.println("Naziv: " + this.getNazivArtikla());
		System.out.println("Bruto tezina: "+ this.getBrutoTezina());
		System.out.println("Neto tezina: " + this.getNetoTezina());
		System.out.println("Osnovna cena: "+ this.osnovnaCena);
		System.out.println("Cena: " + cenaArtikla() + "din.");
		
	}

	
}
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslov:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
