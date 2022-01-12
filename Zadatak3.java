package domaci_10_1_22;

public class Zadatak3 {

	public static void main(String[] args) {
		
		FacebookPost profil = new FacebookPost();
		
		profil.imeIPrezimeKoJeObjavio = "Milan Kostadinovic";
		profil.imeIPrezimeNaKomProfiluJeObjavljeno = "Petar Petrovic";
		profil.textPoruke = "Zdravo!";
		profil.brojLajkova = 12;
		profil.brojDeljenja = 4;
		profil.like();
		profil.dislike();
		profil.share();
		profil.stampaj();
		
		FacebookPost profil2 = new FacebookPost();
		
		profil2.imeIPrezimeKoJeObjavio = "Zoran Kesic";
		profil2.imeIPrezimeNaKomProfiluJeObjavljeno = "Ivan Ivanovic";
		profil2.textPoruke = "24 minuta!";
		profil2.brojLajkova = 30;
		profil2.brojDeljenja = 50;
		profil2.like();
		profil2.dislike();
		profil2.share();
		profil2.stampaj();
	}

}
