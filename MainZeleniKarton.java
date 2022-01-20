package domaci_17_1_22_zadatak1;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton istorija = new ZeleniKarton("Milan Kostadinovic", 5984, "Istorija", "Prof. Petar Petrovic", 6);
		ZeleniKarton geografija = new ZeleniKarton("Milan Kostadinovic", 5984, "Geografija", "Prof. Oliver Nedeljkovic", 5);
		ZeleniKarton srpski = new ZeleniKarton("Milan Kostadinovic", 5984, "Srpski jezik", "Prof. Zivorad Zikic", 7);
		ZeleniKarton matematika = new ZeleniKarton("Milan Kostadinovic", 5984, "Matematika", "Prof. Sladjana Djordjevic", 8);
		ZeleniKarton fizicko = new ZeleniKarton("Milan Kostadinovic", 5984, "Fizicko vaspitanje", "Prof.Violeta Filipovic", 10);
		ZeleniKarton gradjansko = new ZeleniKarton("Milan Kostadinovic", 5984, "Gradjansko vaspitanje", "Prof. Kristina Gradic", 9);
		ZeleniKarton muzicko = new ZeleniKarton("Milan Kostadinovic", 5984, "Muzicko", "Prof. Katarina Rodic", 9);
		ZeleniKarton likovno = new ZeleniKarton("Milan Kostadinovic", 5984, "Likovno", "Prof. Vlada Stosic", 10);
		ZeleniKarton oto = new ZeleniKarton("Milan Kostadinovic", 5984, "Opste tehnicko obrazovanje", "Prof. Vladislav Stosic", 9);
		ZeleniKarton informatika = new ZeleniKarton("Milan Kostadinovic", 5984, "Informatika", "Prof. Jelena Djordjevic", 6);
		ZeleniKarton engleski = new ZeleniKarton("Milan Kostadinovic", 5984, "Engleski jezik", "Prof. Dusan Nikolic", 8);
		ZeleniKarton korespondencija = new ZeleniKarton("Milan Kostadinovic", 5984, "Korespodencija", "Prof. Milena Zivkovic", 7);
		ZeleniKarton fiziologija = new ZeleniKarton("Milan Kostadinovic", 5984, "Fiziologija", "Prof. Dragan Radovanovic", 5);
		ZeleniKarton sociologija = new ZeleniKarton("Milan Kostadinovic", 5984, "Sociologija", "Prof. Katarina Zutic", 9);
		
		ispiti.add(istorija);
		ispiti.add(geografija);
		ispiti.add(srpski);
		ispiti.add(matematika);
		ispiti.add(fizicko);
		ispiti.add(gradjansko);
		ispiti.add(muzicko);
		ispiti.add(likovno);
		ispiti.add(oto);
		ispiti.add(informatika);
		ispiti.add(engleski);
		ispiti.add(korespondencija);
		ispiti.add(fiziologija);
		ispiti.add(sociologija);
		
		for (int i = 0; i < ispiti.size(); i ++) {
			ispiti.get(i).stampaj();
			
		}
		
	}

}

