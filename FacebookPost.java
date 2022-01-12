package domaci_10_1_22;

public class FacebookPost {

	String imeIPrezimeKoJeObjavio;
	String imeIPrezimeNaKomProfiluJeObjavljeno;
	String textPoruke;
	int brojLajkova;
	int brojDeljenja;

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
