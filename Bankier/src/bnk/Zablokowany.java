package bnk;

import crd.Visa;

public class Zablokowany implements StanBankomatu{
	
	Bankomat bankomat;
	
	public Zablokowany(Bankomat nowyBankomat){
		
		bankomat = nowyBankomat;
		
	}


	public void w��Kart�(Visa visa) {
		System.out.println("Zablokowany. Nie w�o�ysz karty.");
		
	}


	public void wysu�Kart�() {
		System.out.println("Zablokowany. Nie odzyskasz karty.");
		
	}


	public void podajPIN(int pin, Visa visa) {
		System.out.println("Zablokowany. Nie podasz pinu.");
		
	}


	public void pobierzGot�wk�(int pinionsDoPobrania) {
		System.out.println("Zablokowany. Nie pobierzesz gotowki.");
		
	}


/*	public void zablokowany() {
		System.out.println("zablokowany");
		
	}*/

}
