package domaci_10_1_22;

public class zadatak1 {

	public static void main(String[] args) {
		
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da 
//		menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se 
//	uračuna popust. Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez 
//		ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


		Proizvod podatak1 = new Proizvod();
	
		podatak1.cena = 49.99;
		podatak1.naziv = "Cokolada";
		podatak1.tezinaUGramima = 90.5;
		podatak1.povecajCenu(10);
		podatak1.vratiCenuSaPopustom(20);
		podatak1.stampaj();
		podatak1.racunajPostarinu();
		podatak1.stampajCenuSaPostarinom();
		
		Proizvod podatak2 = new Proizvod();
		
		podatak2.cena = 159.99;
		podatak2.naziv = "CokoBiskvit";
		podatak2.tezinaUGramima = 250.0;
		podatak2.povecajCenu(120);
		podatak2.vratiCenuSaPopustom(30);
		podatak2.stampaj();
		podatak2.racunajPostarinu();
		podatak2.stampajCenuSaPostarinom();
		
	}

}
