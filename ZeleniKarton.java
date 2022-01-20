package domaci_17_1_22_zadatak1;

public class ZeleniKarton {

		private String imeIPrezimeStudenta;
		private int brojIndexa;
		private String nazivPredmeta;
		private String imeIPrezimeProfesora;
		private int ocena;
		
	public ZeleniKarton() {

	}

	public ZeleniKarton(String imeIPrezimeStudenta, int brojIndexa, String nazivPredmeta, String imeIPrezimeProfesora,
			int ocena) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;

	}

	public String polozio() {
		if (ocena > 5) {
			return "Polozio";
		} else {
			return "Nije polozio";
		}
	}

	public void stampaj() {
		System.out.println(
				"Naziv predmeta: " + this.nazivPredmeta + " - " + "ocena: " + this.ocena + " - " + this.polozio());
		System.out.println("Student: " + this.imeIPrezimeStudenta + " " + this.brojIndexa);
		System.out.println("Profesor: " + this.imeIPrezimeProfesora);
		System.out.println("---------------------------------------------------");
	}

}
