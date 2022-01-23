package domaci_21_1_22;

public class Main {
	//U glavnom programu kreirati jednog magacionera i jednog menadzera,
	//postaviti sektore u kojima rade i ispisati platu za svakog
	public static void main(String[] args) {
		
	Sektor jedan = new Sektor("Cistac", 30000);
	Sektor dva = new Sektor("Salter", 40000);
	Sektor tri = new Sektor("Direktor", 100000);
	
	
	Radnik a = new Menadzer();
	a.zaposliUSektor(jedan);
	
	a.zaposliUSektor(dva);
	
	a.zaposliUSektor(tri);
	
	Radnik b = new Magacioner();
	b.zaposliUSektor(tri);
	
	b.zaposliUSektor(dva);	
	
	b.zaposliUSektor(dva);
	
	
	System.out.println(a.plata());
	System.out.println(b.plata());
	}

}

