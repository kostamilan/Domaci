package domaci_10_1_22;

public class Proizvod {

		String naziv;
		double cena;
		double tezinaUGramima;	

	public void stampaj() {
		System.out.println("{{" +"Naziv je "+ this.naziv + "}}, " + "{{" +"cena je " + this.cena + "}},"
									+ " " + "{{" + "Tezina u gramima " + this.tezinaUGramima + "}}");	
	}

	public void povecajCenu(double povecanjeCene) {
		this.cena = this.cena + povecanjeCene;
	}

	public double vratiCenuSaPopustom (double popust) {
		return this.cena = this.cena - (this.cena * popust / 100);
	}
	
	public double racunajPostarinu() {
		double postarina = 0;
		if (this.tezinaUGramima < 100) {
			postarina = 200;
		} else if (this.tezinaUGramima > 100 && this.tezinaUGramima < 500) {
			postarina = 400;
		} else if (this.tezinaUGramima > 500) {
			postarina = 1000;
		}
			return postarina;
}
	
	public double cenaSaPostarinom() {
		return this.cena = this.cena + this.racunajPostarinu();
	}
	
	public void stampajCenuSaPostarinom() {
		System.out.println("{{Cena sa postarinom je: " + this.cenaSaPostarinom() + "}}");	
	}

}

