package pk;

import bnk.Bankomat;
import crd.Visa;

public class Demo {

	public static void main(String[] args) {
		//tworz� bankomat
		Bankomat b = new Bankomat(3000);
		//tworz� karty
		Visa v = new Visa(1110);
		
		Visa v2 = new Visa(2345);
			v2.setStanVisa(v2.getStanZablokowanaVisa());
		Visa v3 = new Visa(1234);
		
		//sprawdzam
		b.w��Kart�(v);
		b.podajPIN(1110, v);
		b.podajPIN(1110, v);
		b.pobierzGot�wk�(500);
		b.w��Kart�(v);
		b.podajPIN(1110, v);
		b.pobierzGot�wk�(1000);
		System.out.println(b.stanBankomatu.toString());
		System.out.println(v.stanVisa.toString());
		
		b.w��Kart�(v3);
		b.podajPIN(1234, v3);
		b.pobierzGot�wk�(500);
		b.w��Kart�(v3);
		b.podajPIN(1, v3);
		b.podajPIN(1, v3);
		b.podajPIN(1234, v3);
		
		System.out.println(b.stanBankomatu.toString());
		System.out.println(v3.stanVisa.toString());



	}

}
