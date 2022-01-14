package domaci_13_1_22;

public class FacebookPost {

	private String imeIPrezimeKoJeObjavio;
	private String imeIPrezimeNaKomProfiluJeObjavljeno;
	private String textPoruke;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost() {
		
	}
	
	public FacebookPost(String imeIPrezimeKoJeObjavio, String imeIPrezimeNaKomProfiluJeObjavljeno, String textPoruke,
			  			int brojLajkova, int brojDeljenja) {
		this.imeIPrezimeKoJeObjavio = imeIPrezimeKoJeObjavio;
		this.imeIPrezimeNaKomProfiluJeObjavljeno = imeIPrezimeNaKomProfiluJeObjavljeno;
		this.textPoruke = textPoruke;
		this.brojLajkova = brojLajkova;
		this.brojDeljenja = brojDeljenja;
	}
	
	public String getimeIPrezimeKoJeObjavio() {
	return this.imeIPrezimeKoJeObjavio;
}
	public void setImeIPrezimeKoJeObjavio (String imeIPrezimeKoJeObjavio) {
		this.imeIPrezimeKoJeObjavio = imeIPrezimeKoJeObjavio;
	}
	
	public String getImeIPrezimeNaKomProfiluJeObjavljeno() {
		return this.imeIPrezimeNaKomProfiluJeObjavljeno;
	}
	
	public void setImeIPrezimeNaKomProfiluJeObjavljeno(String imeIPrezimeNaKomProfiluJeObjavljeno) {
		this.imeIPrezimeNaKomProfiluJeObjavljeno = imeIPrezimeNaKomProfiluJeObjavljeno;
		
	}
	
	public String getTextPoruke() {
		return this.textPoruke;
	}
	
	public void setTextporuke(String textPoruke) {
		this.textPoruke = textPoruke;
	}
	
	public int getBrojLajkova() {
		return this.brojLajkova;
	}
	
	public int getBrojDeljenja() {
		return this.brojDeljenja;
			
	}
	
	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}
	
	public void dislike() {
		this.brojLajkova = this.brojLajkova - 1;
		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}
	
	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}
	
	public void stampaj() {
		System.out.println(this.imeIPrezimeKoJeObjavio + " >>> " + this.imeIPrezimeNaKomProfiluJeObjavljeno);
		System.out.println(this.textPoruke);
		System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
	}
}