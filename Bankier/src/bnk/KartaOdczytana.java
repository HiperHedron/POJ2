package bnk;

import crd.Visa;

public class KartaOdczytana implements StanBankomatu {
	
	Bankomat bankomat;
	
/*	public void zablokowany() {
		System.out.println("Automat jest zablokowany.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		System.out.println("Oddaje kartê");
		bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		
	}*/	
	
	public KartaOdczytana(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}

	public void w³ó¿Kartê(Visa visa) {
		
		System.out.println("Karta jest ju¿ wo³o¿ona.");
		
	}

	public void wysuñKartê() {
		
		System.out.println("Karta zosta³a wysuniêta.");
		bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		
	}

	public void pobierzGotówkê(int pinionsDoPobrania) {
		
		System.out.println("Nie podano poprawnego PINu.");
		
		
	}

	public void podajPIN(int pin, Visa visa) {
		
		if(pin == visa.pinVisa && visa.stanVisa.equals(visa.aktywna)){
			
			System.out.println("PIN poprawny.");
			bankomat.czyWpisanoPoprawnyPIN = true;
			bankomat.licznikNieudanychPróbPIN = 0;
			bankomat.setStanBankomatu(bankomat.getStanPoprawnyPIN());
		}else if(!visa.stanVisa.equals(visa.aktywna)) {
			System.out.println("Karta jest zablokowana. Nie mo¿esz z niej skorzystaæ.");
			System.out.println("Karta zosta³a wysuniêta.");
			bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		}else if(pin != visa.pinVisa && visa.stanVisa.equals(visa.aktywna)){
			
			System.out.println("Podano niepoprawny PIN. Pozosta³o "+(2-bankomat.licznikNieudanychPróbPIN)+" prób.");
			bankomat.czyWpisanoPoprawnyPIN = false;
			bankomat.licznikNieudanychPróbPIN++;

			if(bankomat.licznikNieudanychPróbPIN>2) {
				System.out.println("Podano 3 razy niepoprawny PIN. Karta zostaje zablokowana.");
				visa.setStanVisa(visa.getStanZablokowanaVisa());
				bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
			}
			
		}	
	}


	
}
