package bnk;

import crd.Visa;

public class Bankomat {
//pola stanów
	StanBankomatu kartaOdczytana;     
	StanBankomatu brakKarty;
	StanBankomatu poprawnyPIN;
	StanBankomatu brakGotówki;
	StanBankomatu zablokowany;
	public StanBankomatu stanBankomatu; //bufor
//pola zmiennych
	boolean czyWpisanoPoprawnyPIN = false;
	int licznikNieudanychPróbPIN = 0;
	int dostêpnaGotówka = 2000;
	
//konstruktor bezargumentowy	
	public Bankomat(int nowaDostepnaGotówka){
		// aktualna instancja klasy przesy³ana jako argument -> 'this' czyli np. bankomat01 czy inny obiekt klasy Bankomat
		kartaOdczytana = new KartaOdczytana(this); 
		brakKarty = new BrakKarty(this);
		poprawnyPIN = new PoprawnyPIN(this);
		brakGotówki = new BrakGotówki(this);
		zablokowany = new Zablokowany(this);
		dostêpnaGotówka = nowaDostepnaGotówka;
		
		stanBankomatu = brakKarty;// nowo utworzony bankomat zaczyna w STANIE brakKarty
		
		if(dostêpnaGotówka <= 0){
			
			stanBankomatu = brakGotówki;
			
		}
		
	}
//metody	
	void setStanBankomatu(StanBankomatu nowyStan){
		
		stanBankomatu = nowyStan;
		
	}
	
	public void setDostêpnaGotówka(int pinions){
		
		dostêpnaGotówka = pinions;
		
	}
	
	public void w³ó¿Kartê(Visa visa) {
		if(visa.stanVisa.equals(visa.aktywna)) {
			stanBankomatu.w³ó¿Kartê(visa);
		}else {
			System.out.println("Karta jest nieaktywna. Wysuwam kartê.");
		}
		
		
	}

	public void wysuñKartê() {
		
		stanBankomatu.wysuñKartê();
		
	}

	public void pobierzGotówkê(int pinionsDoPobrania) {
		
		stanBankomatu.pobierzGotówkê(pinionsDoPobrania);
		
	}

	public void podajPIN(int pin, Visa visa){
		
		stanBankomatu.podajPIN(pin, visa);
		
	}
//gettery	
	public StanBankomatu getStanKartaOdczytana() {
		return kartaOdczytana;
	}
	public StanBankomatu getStanBrakKarty() {
		return brakKarty;
	}
	public StanBankomatu getStanPoprawnyPIN() { 
		return poprawnyPIN; 
	}
	public StanBankomatu getStanBrakGotówki() { 
		return brakGotówki;
	}
	public StanBankomatu getStanZablokowany() { 
		return zablokowany; 
	}
	
}
