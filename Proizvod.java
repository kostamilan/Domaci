package domaci_10_1_22;

public class Proizvod {

		String naziv;
		double cena;
		double tezinaUGramima;	

	public void stampaj() {
		System.out.println("{{" + this.naziv + "}}, " + "{{" + this.cena + "}}, " + "{{" + this.tezinaUGramima + "}}");
}
}