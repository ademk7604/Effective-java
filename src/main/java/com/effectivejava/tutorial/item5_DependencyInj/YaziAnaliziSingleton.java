package com.effectivejava.tutorial.item5_DependencyInj;

public class YaziAnaliziSingleton {
	
	private static final Sozluk turkce = new Sozluk("turkce");
	
	public static YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();
	
	
	private YaziAnaliziSingleton() {}
	
	public static boolean isValid()
	{
		return true;
	}
	
	

}
