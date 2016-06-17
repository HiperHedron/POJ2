package bnk;

import crd.Visa;

public class PoprawnyPIN implements StanBankomatu {
	
	Bankomat bankomat;
	
	public PoprawnyPIN(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}

	public void w³ó¿Kartê(Visa visa) {
		
		System.out.println("Jedna karta jest ju¿ w³o¿ona.");
		
	}

	public void wysuñKartê() {
		
		System.out.println("Karta zosta³a wysuniêta.");
		bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
		
	}

	public void pobierzGotówkê(int pinionsDoPobrania) {

		if(pinionsDoPobrania>bankomat.dostêpnaGotówka) {
			System.out.println("Brak wystarczaj¹cej iloœci gotówki w bankomacie. Podaj ni¿sz¹ kwotê.");
		}else {
			System.out.println("Wyp³acono "+ pinionsDoPobrania + " PLN");
			bankomat.dostêpnaGotówka= bankomat.dostêpnaGotówka - pinionsDoPobrania;
			
			 if(bankomat.dostêpnaGotówka==0) {
					//System.out.println("Karta zosta³a wysuniêta");
					System.out.println("Brak gotówki w bankomacie. Blokujê automat.");
					bankomat.setStanBankomatu(bankomat.getStanZablokowany());
			 }else {
				 System.out.println("Karta zosta³a wysuniêta.");
				 bankomat.setStanBankomatu(bankomat.getStanBrakKarty());
			 }
				
		}

	}

	public void podajPIN(int pin, Visa visa) {
		
		System.out.println("PIN ju¿ jest podany.");
		
	}

	
/*	public void zablokowany() {
		System.out.println("Bankomat zosta³ zablokowany.");
		
	}*/	
}
