package bnk;

import crd.Visa;

//klasa reprezentuj¹ca nowy stan bankomatu. Implementuje interfejs wymuszaj¹cy pewne metody, które spowoduj¹ kolejn¹ zmianê stanu.
public class BrakGotówki implements StanBankomatu {
	
	Bankomat bankomat;
	
	public BrakGotówki(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}

	public void w³ó¿Kartê(Visa visa) {
		if(visa.stanVisa.equals(visa.aktywna)) {
			System.out.println("Brak gotówki w bankomacie.");
			bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		}else {
			System.out.println("Karta jest nieaktywna. Wysuwam kartê.");
		}
		
		
	}

	public void wysuñKartê() {
		
		System.out.println("Brak gotówki w bankomacie.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		
	}

	public void pobierzGotówkê(int pinionsDoPobrania) {
		
		System.out.println("Brak gotówki w bankomacie.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		
	}

	public void podajPIN(int pin, Visa visa) {
		
		System.out.println("Brak gotówki w bankomacie.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		
	}

	/*public void zablokowany() {
		 System.out.println("zablokowany");
		
	}*/	
}
