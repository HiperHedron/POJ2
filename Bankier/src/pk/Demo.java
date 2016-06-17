package pk;

import bnk.Bankomat;
import crd.Visa;

public class Demo {

	public static void main(String[] args) {
		//tworzê bankomat
		Bankomat b = new Bankomat(3000);
		//tworzê karty
		Visa v = new Visa(1110);
		
		Visa v2 = new Visa(2345);
			v2.setStanVisa(v2.getStanZablokowanaVisa());
		Visa v3 = new Visa(1234);
		
		//sprawdzam
		b.w³ó¿Kartê(v);
		b.podajPIN(1110, v);
		b.podajPIN(1110, v);
		b.pobierzGotówkê(500);
		b.w³ó¿Kartê(v);
		b.podajPIN(1110, v);
		b.pobierzGotówkê(1000);
		System.out.println(b.stanBankomatu.toString());
		System.out.println(v.stanVisa.toString());
		
		b.w³ó¿Kartê(v3);
		b.podajPIN(1234, v3);
		b.pobierzGotówkê(500);
		b.w³ó¿Kartê(v3);
		b.podajPIN(1, v3);
		b.podajPIN(1, v3);
		b.podajPIN(1234, v3);
		
		System.out.println(b.stanBankomatu.toString());
		System.out.println(v3.stanVisa.toString());



	}

}
