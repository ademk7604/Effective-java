package com.effectivejava.tutorial.effectivejava.item1StaticFactoryM;

public class Fenerbahce {
	
	private String yeniFutbolcu;
	private int age;
	
	public Fenerbahce(String yeniFutbolcu, int age) {
		
		this.yeniFutbolcu=yeniFutbolcu;
		this.age=age;
		
	}
	//yasi belli  yeni futbolcu uretmek istedigim de bu sekilde static method ile yapilir
	public static Fenerbahce yeniFutbolcuuret(String yeniFutbolcu) {
		return new Fenerbahce(yeniFutbolcu, 22);
	}
	

}
