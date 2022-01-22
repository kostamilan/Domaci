package domaci_20_1_22;

public class Trener extends Osoba {

	private int godineIskustva;
	private String tipTrenera;
	
	
	public Trener() {
		super();
		
	}
	
	public Trener(String imeIPrezime, String jmbg, int godinaRodjenja) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.godineIskustva = this.godineIskustva;
		this.tipTrenera = this.tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}	
	
	public void stampajTrenera() {
		this.stampajOsobu();
		System.out.println("Godine iskustva: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
	}
	}
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
