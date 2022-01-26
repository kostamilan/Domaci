package domaci_24_1_22;

public abstract class Ambalaza {

	protected String barkod;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;
	
	
	public Ambalaza() {
		
	}
	
	public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
		this.barkod = barkod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public String getNazivArtikla() {
		return nazivArtikla;
	}
	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}
	public double getNetoTezina() {
		return netoTezina;
	}
	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}
	public double getBrutoTezina() {
		return brutoTezina;
	}
	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	
	public double tezinaPakovanja() {
		double tezina = this.brutoTezina - this.netoTezina;
		return tezina;
	}
	
	public abstract double cenaArtikla();
	
	public abstract void stampaj();
	
}
//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj

