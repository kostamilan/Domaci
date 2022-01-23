package domaci_21_1_22;

public class Menadzer extends Radnik {
	//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
	//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer() {
		super();
	}

	double sumaPlata=0;

	@Override
	public double plata() {
		for(int i=0;i<nizSektora.size();i++) {
			sumaPlata=sumaPlata+nizSektora.get(i).plata;
		}
		return sumaPlata;
	}


}
