package domaci_10_1_22;

public class zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

		Proizvod podatak1 = new Proizvod();
		
		podatak1.cena = 99.99;
		podatak1.naziv = "Cokolada";
		podatak1.tezinaUGramima = 90.5;
		
		podatak1.stampaj();
		
		Proizvod podatak2 = new Proizvod();
		
		podatak2.cena = 199.99;
		podatak2.naziv = "CokoBiskvit";
		podatak2.tezinaUGramima = 250.0;
		
		podatak2.stampaj();
	}

}
