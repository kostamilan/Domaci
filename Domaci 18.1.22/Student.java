package domaci_18_1_22;

import java.util.ArrayList;

public class Student {

	private String brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();


	public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}

	public void dodajIspit(Ispit ispit) {
		this.nizIspita.add(ispit); 
	}
	
	public double prosek() {
		double prosecnaVrednost = 0;
		for(int i = 0; i < nizIspita.size(); i++) {
			
			prosecnaVrednost = prosecnaVrednost + this.nizIspita.get(i).getOcena();
			
		}
		return prosecnaVrednost = prosecnaVrednost / nizIspita.size();
	}
	
	public void stampajStudent() {
		System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		
		for(int i = 0; i < this.nizIspita.size(); i++) {
			this.nizIspita.get(i).stampaj();
		}
		System.out.println("Prosecna ocena: " + prosek());
	}
	
}
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
