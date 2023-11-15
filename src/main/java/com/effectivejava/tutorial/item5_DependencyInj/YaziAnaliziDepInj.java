package com.effectivejava.tutorial.item5_DependencyInj;

import java.util.function.Supplier;

public class YaziAnaliziDepInj {
	
	private final Sozluk sozluk;
	
	public YaziAnaliziDepInj(Supplier<Sozluk> sozluk) {
		//sozluk_=sozluk desen this demeye gerek yok
		this.sozluk=sozluk.get();
		
	}
	
	public boolean isValid() 
	{
		return true;
	}

}
