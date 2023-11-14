package com.effectivejava.tutorial.item1_StaticFactoryM;

public class ItemOneTest {
	public static void main(String[] args) {
		//static Factory Method, gerekli olduunda kullanmakta fayda var OOP yi etkiliyor
		//isimli static constructor da yapilabilir
		//Yemek yemek = Yemek.sicakYemek(name);
		
		Fenerbahce fener = new Fenerbahce("Mesut", 22);
		Fenerbahce fb = Fenerbahce.yeniFutbolcuuret("Ronaldinho");
		
	}
	
	
	

}
