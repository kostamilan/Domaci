package domaci_20_1_22;

public class Main {

	public static void main(String[] args) {
		
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

	Trener t = new Trener("Dragan Travica", "21312531523", 1950);
	Trener t2 = new Trener("Igor Kolakovic", "5457654534", 1960);
	
	Igrac i = new Igrac("Ivan Miljkovic", "2131241250", 1977);
	Igrac i2 = new Igrac("Goran Vujevic", "5476323254", 1975);
	
	t.setGodineIskustva(4);
	t.setTipTrenera("Selektor");
	i.setBrojNaDresu(14);
	i.setPozicijaNaTerenu("Korektor");
	i.setKapiten(true);
	i.stampajIgraca();
	
	t.stampajTrenera();
	
	}

}
