package bnk;

import crd.Visa;

public class KartaOdczytana implements StanBankomatu {
	
	Bankomat bankomat;
	
/*	public void zablokowany() {
		System.out.println("Automat jest zablokowany.");
		bankomat.setStanBankomatu(bankomat.getStanZablokowany());
		System.out.println("Oddaje kart�");
		bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		
	}*/	
	
	public KartaOdczytana(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}

	public void w��Kart�(Visa visa) {
		
		System.out.println("Karta jest ju� wo�o�ona.");
		
	}

	public void wysu�Kart�() {
		
		System.out.println("Karta zosta�a wysuni�ta.");
		bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		
	}

	public void pobierzGot�wk�(int pinionsDoPobrania) {
		
		System.out.println("Nie podano poprawnego PINu.");
		
		
	}

	public void podajPIN(int pin, Visa visa) {
		
		if(pin == visa.pinVisa && visa.stanVisa.equals(visa.aktywna)){
			
			System.out.println("PIN poprawny.");
			bankomat.czyWpisanoPoprawnyPIN = true;
			bankomat.licznikNieudanychPr�bPIN = 0;
			bankomat.setStanBankomatu(bankomat.getStanPoprawnyPIN());
		}else if(!visa.stanVisa.equals(visa.aktywna)) {
			System.out.println("Karta jest zablokowana. Nie mo�esz z niej skorzysta�.");
			System.out.println("Karta zosta�a wysuni�ta.");
			bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		}else if(pin != visa.pinVisa && visa.stanVisa.equals(visa.aktywna)){
			
			System.out.println("Podano niepoprawny PIN. Pozosta�o "+(2-bankomat.licznikNieudanychPr�bPIN)+" pr�b.");
			bankomat.czyWpisanoPoprawnyPIN = false;
			bankomat.licznikNieudanychPr�bPIN++;

			if(bankomat.licznikNieudanychPr�bPIN>2) {
				System.out.println("Podano 3 razy niepoprawny PIN. Karta zostaje zablokowana.");
				visa.setStanVisa(visa.getStanZablokowanaVisa());
				bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
			}
			
		}	
	}


	
}
