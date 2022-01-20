package domaci_17_1_22drugi;

import java.util.ArrayList;

import domaci_17_1_22_zadatak1.ZeleniKarton;

public class zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Racun koja ima:
//			broj racuna (npr: 170-289328923-23)
//			ime i prezime osobe
//			trenutno stanje na racunu (npr: 100, 1220)
//			gettere i setter za sve atribute, sem settera za stanje na racunu
//			metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//			metodu koja stampa podatke o racunu u formatu:
//			Ime i prezime  -  broj racuna
//			stanje na racunu je (trenutno stanje) rsd.
//				
//
//					Kreirati klasu Transakcija koja ima:
//			id transakcije
//			racun sa kog se prenose sredstva
//			racun na koji se prenose sredstva
//			gettere i settere
//			konstruktore
//			privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//			ako je prenos sredstava manji od 4500, provizija je fiksna 45
//			ako je prenos sredstava veci od 4500, provizija je 1% 
//			S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar 
// 		    koji predstavlja visinu transakcije
//			Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//			metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi 
//			vrednost koja se prebacuje. 
//			Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//			(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//			metodu koja stampa podatke o transakciji u formatu:
//			id transkacije
//			Racun sa: Ime i prezime  -  broj racuna
//			Racun na: Ime i prezime  -  broj racuna
//
//				Naravno u glavnom kreirati objekte i testirati funkcionalnosti 

		ArrayList<Racun> racuni = new ArrayList<Racun>();
		
		Racun milanov = new Racun("1231-3123-4444-555", "Milan Kostadinovic", 10000.00);
		Racun ivanov = new Racun("1551-3155-774-599", "Ivan Miletic", 15700.00);
		Racun dusanov = new Racun("1111-22222-774-999", "Dusan Kostadinovic", 25000.00);
	
		racuni.add(milanov);
		
		racuni.add(ivanov);
		
		racuni.add(dusanov);
		
		milanov.menjaTrenutnoStanje(5000);
		
		for (int i = 0; i < racuni.size(); i ++) {
			racuni.get(i).stampaj();
		
		}
	}

}
