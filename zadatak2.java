package domaci_10_1_22;

public class zadatak2 {

	public static void main(String[] args) {
		
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

		
		SmartAirConditioning klima = new SmartAirConditioning();
		
		klima.marka = "Tesla";
		klima.potrosnjaElEnergijeGreje = 5;
		klima.potrosnjaElEnergijeHladi = 3;
		klima.izabranaTemperatura = 26;
		klima.mod = "Greje";
		klima.stampaj();
		System.out.println("Mesecna potrosnja u kw je: " + klima.mesecnaPotrosnjaKW("Greje"));
		System.out.println("Mesecna potrosnja u dinarina je: " + klima.potrosnjaNovcaZaMesecDana() + " dinara");
		
		System.out.println("------------------------------------------------");
		
		SmartAirConditioning klima2 = new SmartAirConditioning();

		klima2.marka = "Samsung";
		klima2.potrosnjaElEnergijeGreje = 3;
		klima2.potrosnjaElEnergijeHladi = 2;
		klima2.izabranaTemperatura = 17;
		klima2.mod = "Hladi";
		klima2.stampaj();
		System.out.println("Mesecna potrosnja u kw je: " + klima2.mesecnaPotrosnjaKW("Hladi"));
		System.out.println("Mesecna potrosnja u dinarina je: " + klima2.potrosnjaNovcaZaMesecDana() + " dinara");

	}

}
