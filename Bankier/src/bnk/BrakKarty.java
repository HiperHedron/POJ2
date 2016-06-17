package bnk;

import crd.Visa;

public class BrakKarty implements StanBankomatu {
	
	Bankomat bankomat;
	


	
	public BrakKarty(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}
	
	/*public void zablokowany() {
		System.out.println("Zablokowany");
		
	}*/

	public void w��Kart�(Visa visa) {
		if(visa.stanVisa.equals(visa.aktywna)) {
			System.out.println("Podaj PIN.");
			bankomat.setStanBankomatu(bankomat.getStanKartaOdczytana());
		}else {
			System.out.println("Karta jest zablokowana. Nie mo�na wpisa� PIN");
		}
		
		
	}

	public void wysu�Kart�() {
		
		System.out.println("Karty nie ma w bankomacie.");
		
	}

	public void pobierzGot�wk�(int pinionsDoPobrania) {
		
		System.out.println("Karty nie ma w Bankomacie.");
		
	}

	public void podajPIN(int pin, Visa visa) {
		
		System.out.println("Karty nie ma w Bankomacie.");
		
	}

	
}
