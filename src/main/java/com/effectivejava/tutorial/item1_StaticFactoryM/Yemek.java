package com.effectivejava.tutorial.item1_StaticFactoryM;

public class Yemek {
	String yemek;
	/* direk zorunlu const. yenine isimli constructor da verilebilir
	public Yemek(boolean soguk) {
		
	}
	*/
	
	public static Yemek sogukYemek(String name) {
		//soguk yemek
		return new SogukYemek();
	}
	
	public static Yemek sicakYemek(String name) {
		return new Pide();
	}

}
