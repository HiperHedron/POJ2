package bnk;

import crd.Visa;

public class PoprawnyPIN implements StanBankomatu {
	
	Bankomat bankomat;
	
	public PoprawnyPIN(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}

	public void w��Kart�(Visa visa) {
		
		System.out.println("Jedna karta jest ju� w�o�ona.");
		
	}

	public void wysu�Kart�() {
		
		System.out.println("Karta zosta�a wysuni�ta.");
		bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		
	}

	public void pobierzGot�wk�(int pinionsDoPobrania) {

		if(pinionsDoPobrania>bankomat.dost�pnaGot�wka) {
			System.out.println("Brak wystarczaj�cej ilo�ci got�wki w bankomacie. Podaj ni�sz� kwot�.");
		}else {
			System.out.println("Wyp�acono "+ pinionsDoPobrania + " PLN");
			bankomat.dost�pnaGot�wka= bankomat.dost�pnaGot�wka - pinionsDoPobrania;
			
			 if(bankomat.dost�pnaGot�wka==0) {
					//System.out.println("Karta zosta�a wysuni�ta");
					System.out.println("Brak got�wki w bankomacie. Blokuj� automat.");
					bankomat.setStanBankomatu(bankomat.getStanZablokowany());
			 }else {
				 System.out.println("Karta zosta�a wysuni�ta.");
				 bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
			 }
				
		}

	}

	public void podajPIN(int pin, Visa visa) {
		
		System.out.println("PIN ju� jest podany.");
		
	}

	
/*	public void zablokowany() {
		System.out.println("Bankomat zosta� zablokowany.");
		
	}*/	
}
