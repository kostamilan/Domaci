package domaci_14_1_22;

public class Knjiga {
	
	private String ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	

	public Knjiga() {
		
	}
	
	public Knjiga(String ISBN, String naziv, int godinaIzdanja) {
		this.ISBN = ISBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getNaziv() {
		return this.ISBN;
		
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;

	}
	
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	
	
	public void print() {
		System.out.println(ISBN);
		System.out.println(naziv + " - " + godinaIzdanja + " god." );
		System.out.println(this.autor.getImeIPrezime());
		
	}
	
	public void setAutor(Autor a) {
		this.autor = a;
	}

	public Autor getAutor() {
		return this.autor;
	}
}

