package domaci_14_1_22;

public class Autor {

	private String imeIPrezime;
	
	public Autor() {
		
	}
	
	public Autor(String imeIPrezime){
	this.imeIPrezime = imeIPrezime;
	}
	
	public String getImeIPrezime() {
		return this.imeIPrezime;
	}
	
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	public void stampaj() {
		System.out.println(imeIPrezime);
	}
}
