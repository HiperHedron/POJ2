package bnk;

import crd.Visa;

//klasa reprezentuj�ca nowy stan bankomatu. Implementuje interfejs wymuszaj�cy pewne metody, kt�re spowoduj� kolejn� zmian� stanu.
public class BrakGot�wki implements StanBankomatu {
	
	Bankomat bankomat;
	
	public BrakGot�wki(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}

	public void w��Kart�(Visa visa) {
		if(visa.stanVisa.equals(visa.aktywna)) {
			System.out.println("Brak got�wki w bankomacie.");
			bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		}else {
			System.out.println("Karta jest nieaktywna. Wysuwam kart�.");
		}
		
		
	}

	public void wysu�Kart�() {
		
		System.out.println("Brak got�wki w bankomacie.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		
	}

	public void pobierzGot�wk�(int pinionsDoPobrania) {
		
		System.out.println("Brak got�wki w bankomacie.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		
	}

	public void podajPIN(int pin, Visa visa) {
		
		System.out.println("Brak got�wki w bankomacie.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		
	}

	/*public void zablokowany() {
		 System.out.println("zablokowany");
		
	}*/	
}
