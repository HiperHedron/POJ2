package bnk;

import crd.Visa;

public class Zablokowany implements StanBankomatu{
	
	Bankomat bankomat;
	
	public Zablokowany(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}


	public void w³ó¿Kartê(Visa visa) {
		System.out.println("Zablokowany. Nie w³o¿ysz karty.");
		
	}


	public void wysuñKartê() {
		System.out.println("Zablokowany. Nie odzyskasz karty.");
		
	}


	public void podajPIN(int pin, Visa visa) {
		System.out.println("Zablokowany. Nie podasz pinu.");
		
	}


	public void pobierzGotówkê(int pinionsDoPobrania) {
		System.out.println("Zablokowany. Nie pobierzesz gotowki.");
		
	}


/*	public void zablokowany() {
		System.out.println("zablokowany");
		
	}*/

}
