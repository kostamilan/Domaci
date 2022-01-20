package domaci_17_1_22drugi;

public class Racun {
	
	private String broj;
	private String imeIPrezimeOsobe;
	private double trenutnoStanje;
	
	
	public Racun() {
		
	}
	
	public Racun(String broj, String imeIPrezimeOsobe, double trenutnoStanje) {
		this.broj = broj;
		this.imeIPrezimeOsobe = imeIPrezimeOsobe;
		this.trenutnoStanje = trenutnoStanje;
		
	}
	
	public String getBroj() {
		return broj;
	}
	
	public void setBroj(String broj) {
		this.broj = broj;
	}
	
	public String getImeIPrezime() {
		return imeIPrezimeOsobe;
	}
	
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezimeOsobe = imeIPrezime;
	}
	
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public void menjaTrenutnoStanje (double stanje)	{
		if(this.trenutnoStanje - stanje > 0) {
		this.trenutnoStanje = this.trenutnoStanje - stanje;
		}
		else {
			System.out.println("Nemate dovoljno sredstava na racunu.");
		}
	}
	
	public void stampaj() {
		System.out.println(this.imeIPrezimeOsobe + " - " + this.broj);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " rsd");
	}
		
	}


