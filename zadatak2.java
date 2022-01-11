package domaci_10_1_22;

public class zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu
		
		SmartAirConditioning klima = new SmartAirConditioning();
		
		klima.marka = "Tesla";
		klima.mod = "hladi";
		klima.temperatura = 17;
		klima.stampaj();
		System.out.println("-------------------------------------------------------------------------------");
		SmartAirConditioning klima2 = new SmartAirConditioning();
		
		klima2.marka = "LG";
		klima2.mod = "greje";
		klima2.temperatura = 27;
		klima2.stampaj();
	}

}
