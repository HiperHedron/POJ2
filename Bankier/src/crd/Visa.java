package crd;

public class Visa {
	//pola stanów
	StanVisa zablokowana;
	public StanVisa aktywna;
	public StanVisa stanVisa;
	//pola zmiennych
	public int pinVisa = 1111;
	//konstruktor
	
	public Visa(int nowyPin) {
		zablokowana = new ZablokowanaVisa(this);
		aktywna = new AktywnaVisa(this);
		stanVisa = aktywna;
		pinVisa = nowyPin;
	}
	
public void setStanVisa(StanVisa nowyStan){
		
	stanVisa = nowyStan;
		
	}
//getery

public StanVisa getStanZablokowanaVisa() {
	return zablokowana;
}

}
