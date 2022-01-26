package domaci_24_1_22;

public class SuperKartica {

	private int brojKartice;
	private String imeIPrezimeVlasnika;
	private double popust;
	
	
	public SuperKartica() {
		
	}
	
	public SuperKartica(int brojKartice, String imeIPrezimeVlasnika, double popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
		this.popust = popust;
	}

	public int getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImeIPrezimeVlasnika() {
		return imeIPrezimeVlasnika;
	}

	public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public void stampajKarticu() {
		System.out.println("Broj kartice je " + this.brojKartice +  ", " + "na ime " + this.imeIPrezimeVlasnika);
	}
	
}
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
