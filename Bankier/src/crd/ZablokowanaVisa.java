package crd;

public class ZablokowanaVisa implements StanVisa {
	
	Visa visa;

	public ZablokowanaVisa(Visa nowaVisa) {
		visa = nowaVisa;
	}

	public void zablokujKartê() {
		System.out.println("Karta ju¿ jest zablokowana.");

	}

}
