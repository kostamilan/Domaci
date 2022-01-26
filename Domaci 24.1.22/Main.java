package domaci_24_1_22;

public class Main {

	public static void main(String[] args) {
		
		Ambalaza prvaAmbalaza = new Tetrapak("2312-123-42-42","Cokoladno mleko", 250, 200,true,60);
		Ambalaza drugaAmbalaza = new Tetrapak("456-648-43-35","Jogurt", 100, 70, false, 30);
		Ambalaza trecaAmbalaza = new Tetrapak("568-4684-2-325","Zuti sok", 2200, 2000, true, 140);
		
		SuperKartica platicesvise = new SuperKartica(554, "Milan Kostadinovic", 20);
		
		Korpa korpa = new Korpa();
		korpa.dodajAmbalazu(prvaAmbalaza);
		korpa.dodajAmbalazu(drugaAmbalaza);
		korpa.dodajAmbalazu(trecaAmbalaza);
		korpa.izbaciAmbalazu("2312-123-42-42");
		
		korpa.ukupnaCenaKorpeSuperKartica(platicesvise);
		
		korpa.stampaj();
		System.out.println("-----------------------------------------------");
		platicesvise.stampajKarticu();
		
	}

}
//  U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih 
//  tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
