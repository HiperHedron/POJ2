package bnk;

import crd.Visa;

public interface StanBankomatu {
	
	//interfejs kontraktuj�cy metody dla klas kt�re go implementuj�. B�d� s�u�y� do zmiany stanu bankomatu
	void w��Kart�(Visa visa); //->KartaOdczytana
	
	void wysu�Kart�(); //->BrakKarty
	
	void podajPIN(int pin, Visa visa); //->PoprawnyPin lub Zablokowany
	
	void pobierzGot�wk�(int pinionsDoPobrania); //->BrakGot�wki
	
	//void zablokowany();
	
}
