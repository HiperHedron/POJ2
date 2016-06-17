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

	public void w³ó¿Kartê(Visa visa) {
		if(visa.stanVisa.equals(visa.aktywna)) {
			System.out.println("Podaj PIN.");
			bankomat.setStanBankomatu(bankomat.getStanKartaOdczytana());
		}else {
			System.out.println("Karta jest zablokowana. Nie mo¿na wpisaæ PIN");
		}
		
		
	}

	public void wysuñKartê() {
		
		System.out.println("Karty nie ma w bankomacie.");
		
	}

	public void pobierzGotówkê(int pinionsDoPobrania) {
		
		System.out.println("Karty nie ma w Bankomacie.");
		
	}

	public void podajPIN(int pin, Visa visa) {
		
		System.out.println("Karty nie ma w Bankomacie.");
		
	}

	
}
