package bnk;

import crd.Visa;

public interface StanBankomatu {
	
	//interfejs kontraktuj¹cy metody dla klas które go implementuj¹. Bêd¹ s³u¿yæ do zmiany stanu bankomatu
	void w³ó¿Kartê(Visa visa); //->KartaOdczytana
	
	void wysuñKartê(); //->BrakKarty
	
	void podajPIN(int pin, Visa visa); //->PoprawnyPin lub Zablokowany
	
	void pobierzGotówkê(int pinionsDoPobrania); //->BrakGotówki
	
	//void zablokowany();
	
}
