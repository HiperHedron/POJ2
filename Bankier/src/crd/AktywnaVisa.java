package crd;

public class AktywnaVisa implements StanVisa {
	
	Visa visa;
	
	

	public AktywnaVisa(Visa nowaVisa) {
		visa = nowaVisa;
	}



	public void zablokujKartê() {
		System.out.println("Karta zosta³a zablokowana.");
		visa.setStanVisa(visa.getStanZablokowanaVisa());

	}

}
