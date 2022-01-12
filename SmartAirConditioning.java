package domaci_10_1_22;

public class SmartAirConditioning {

		String marka;
		int potrosnjaElEnergijeHladi;
		int potrosnjaElEnergijeGreje;
		int izabranaTemperatura;
		String mod;
		
		public void stampaj() {
			System.out.println(this.marka + " - " + this.mod + " - " + this.izabranaTemperatura);
	}
		
		public double mesecnaPotrosnjaKW(String mod) {
			double mesecnaPotrosnjaKW = 0;
			if(mod.equalsIgnoreCase("greje")) {
				mesecnaPotrosnjaKW = 30 * 15 * potrosnjaElEnergijeGreje;
			} else if(mod.equalsIgnoreCase("hladi")) {
				mesecnaPotrosnjaKW = 30 * 15 * potrosnjaElEnergijeHladi;
			}
			return mesecnaPotrosnjaKW;
		}
		
		public double potrosnjaNovcaZaMesecDana() {
			double mesecnaPotrosnjaNovac = 0;
			if(this.mesecnaPotrosnjaKW(mod) <= 350) {
				mesecnaPotrosnjaNovac = this.mesecnaPotrosnjaKW(mod) * 6;
			} else {
				mesecnaPotrosnjaNovac = 350 * 6 + (this.mesecnaPotrosnjaKW(mod) - 350) * 9;
			}
			return mesecnaPotrosnjaNovac;
		}
	}
		



