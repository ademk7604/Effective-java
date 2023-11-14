package com.effectivejava.tutorial.item2_BuilderDesingP;

public class ItemTwoTest {
	public static void main(String[] args) {
		
		// builder desing pattern ile sade tek kullanim
		
		StarbucksBuilder sb = new StarbucksBuilder.Builder("tall").yumusakIcenler("ben yumusak istiyorum").build();
		
		
		
		/* 1. cozum
		Starbucks sb = new Starbucks()
		dusunsene 7 10 tane parametre olsa cok kotu karisik
		*/
		
		/* 2. cozum 
		 * ilk cozume gore biraz daha iyi ama bununda eksiklikleri var
		Starbucks sb = new Starbucks();
		sb.setKahveBoyutu("kucuk");
		int deger = 10; // istedigimde burda birseyler ekleyebilirim ama butunlugu bozuyor
		
		sb.setYumusatici("bana ekle");
		*/
		
		
		
		
		
		
		
	}

}
