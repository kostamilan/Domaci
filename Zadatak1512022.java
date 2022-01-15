package domaci_14_1_22;

import predavanja_14_1_22.Film;
import predavanja_14_1_22.Reziser;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
		
		Knjiga koreni = new Knjiga("123-1311-31", "Koreni", 1954);
		Autor dobrica = new Autor("Dobrica Cosic");
		koreni.setAutor(dobrica);
		koreni.print();
		
		System.out.println("------------------");
		
		Knjiga orloviRanoLete = new Knjiga ("45354-665-764", "Orlovi rano lete", 1959);
		Autor branko = new Autor("Branko Copic");
		orloviRanoLete.setAutor(branko);
		orloviRanoLete.print();
		
		System.out.println("------------------");
		
		Knjiga hajduci = new Knjiga ("9954-9942-256", "Hajduci", 1933);
		Autor branislav = new Autor ("Branislav Nusic");
		hajduci.setAutor(branislav);
		hajduci.print();
		
		System.out.println("------------------");
		
		Knjiga naDriniCuprija = new Knjiga ("6524-5624-6547", "Na Drini cuprija", 1945);
		Autor ivo = new Autor ("Ivo Andric");
		naDriniCuprija.setAutor(ivo);
		naDriniCuprija.print();
	}

}
