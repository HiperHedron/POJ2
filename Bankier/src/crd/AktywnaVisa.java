package crd;

public class AktywnaVisa implements StanVisa {
	
	Visa visa;
	
	

	public AktywnaVisa(Visa nowaVisa) {
		visa = nowaVisa;
	}



	public void zablokujKart�() {
		System.out.println("Karta zosta�a zablokowana.");
		visa.setStanVisa(visa.getStanZablokowanaVisa());

	}

}
