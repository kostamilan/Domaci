package domaci_10_1_22;

public class SmartAirConditioning {

		String marka;
		int temperatura;
		String mod;
	
		public void stampaj() {
			System.out.println(this.marka + " klima uredjaj trenutno hladi na " + this.temperatura + " stepeni "
					+ "zato sto je ukljucen mod " + this.mod + ". ");
		}
}
