package bnk;

import crd.Visa;

public class Bankomat {
//pola stan�w
	StanBankomatu kartaOdczytana;     
	StanBankomatu brakKarty;
	StanBankomatu poprawnyPIN;
	StanBankomatu brakGot�wki;
	StanBankomatu zablokowany;
	public StanBankomatu stanBankomatu; //bufor
//pola zmiennych
	boolean czyWpisanoPoprawnyPIN = false;
	int licznikNieudanychPr�bPIN = 0;
	int dost�pnaGot�wka = 2000;
	
//konstruktor bezargumentowy	
	public Bankomat(int nowaDostepnaGot�wka){
		// aktualna instancja klasy przesy�ana jako argument -> 'this' czyli np. bankomat01 czy inny obiekt klasy Bankomat
		kartaOdczytana = new KartaOdczytana(this); 
		brakKarty = new BrakKarty(this);
		poprawnyPIN = new PoprawnyPIN(this);
		brakGot�wki = new BrakGot�wki(this);
		zablokowany = new Zablokowany(this);
		dost�pnaGot�wka = nowaDostepnaGot�wka;
		
		stanBankomatu = brakKarty;// nowo utworzony bankomat zaczyna w STANIE brakKarty
		
		if(dost�pnaGot�wka <= 0){
			
			stanBankomatu = brakGot�wki;
			
		}
		
	}
//metody	
	void setStanBankomatu(StanBankomatu nowyStan){
		
		stanBankomatu = nowyStan;
		
	}
	
	public void setDost�pnaGot�wka(int pinions){
		
		dost�pnaGot�wka = pinions;
		
	}
	
	public void w��Kart�(Visa visa) {
		if(visa.stanVisa.equals(visa.aktywna)) {
			stanBankomatu.w��Kart�(visa);
		}else {
			System.out.println("Karta jest nieaktywna. Wysuwam kart�.");
		}
		
		
	}

	public void wysu�Kart�() {
		
		stanBankomatu.wysu�Kart�();
		
	}

	public void pobierzGot�wk�(int pinionsDoPobrania) {
		
		stanBankomatu.pobierzGot�wk�(pinionsDoPobrania);
		
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
	public StanBankomatu getStanBrakGot�wki() { 
		return brakGot�wki;
	}
	public StanBankomatu getStanZablokowany() { 
		return zablokowany; 
	}
	
}
